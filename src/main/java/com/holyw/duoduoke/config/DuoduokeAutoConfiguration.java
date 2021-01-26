package com.holyw.duoduoke.config;

import com.holyw.duoduoke.client.DefaultDuoduokeClient;
import com.holyw.duoduoke.client.IClient;
import com.holyw.duoduoke.core.DuoduokeGoodsTemplate;
import com.holyw.duoduoke.core.DuoduokeOrderTemplate;
import com.holyw.duoduoke.exception.DuoduokeClientNotFoundException;
import com.holyw.duoduoke.proxy.PddPrimaryProxy;
import com.holyw.duoduoke.support.DuoduokeSupportRepository;
import com.pdd.pop.sdk.http.PopClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

@ConditionalOnClass(PopClient.class)
@EnableConfigurationProperties({DuoduokePropeties.class})
@Configuration
public class DuoduokeAutoConfiguration {

    @Bean
    public IClient duoduokeClient(DuoduokePropeties duoduokePropeties) throws DuoduokeClientNotFoundException {
        IClient client;
        if (StringUtils.isEmpty(duoduokePropeties.getClientClassName())) {
            client = new DefaultDuoduokeClient(duoduokePropeties);
        } else {
            try {
                Class<IClient> clazz = (Class<IClient>) Class.forName(duoduokePropeties.getClientClassName());
                client = clazz.newInstance();
            } catch (IllegalAccessException e) {
                throw new DuoduokeClientNotFoundException();
            } catch (InstantiationException e) {
                throw new DuoduokeClientNotFoundException();
            } catch (ClassNotFoundException e) {
                throw new DuoduokeClientNotFoundException();
            }
        }
        return client;

    }

    @Bean
    public DuoduokeSupportRepository duoduokeRepository(IClient client) {
        DuoduokeSupportRepository duoduokeSupportRepository = new PddPrimaryProxy(client).getProxy(DuoduokeSupportRepository.class);
        return duoduokeSupportRepository;
    }

    @Bean
    public DuoduokeGoodsTemplate pddGoodsTemplate(DuoduokeSupportRepository duoduokeSupportRepository) {
        return new DuoduokeGoodsTemplate(duoduokeSupportRepository);
    }

    @Bean
    public DuoduokeOrderTemplate pddOrderTemplate(DuoduokeSupportRepository duoduokeSupportRepository) {
        return new DuoduokeOrderTemplate(duoduokeSupportRepository);
    }

}

package com.holyw.duoduoke.config.jingdong;

import com.holyw.duoduoke.client.IClient;
import com.holyw.duoduoke.client.jingdong.DefaultJingdongClient;
import com.holyw.duoduoke.exception.ClientNotFoundException;
import com.holyw.duoduoke.proxy.jingdong.JingdongPrimaryProxy;
import com.holyw.duoduoke.support.jingdong.JingdongSupportRepository;
import com.holyw.duoduoke.template.jingdong.JingdongGoodsTemplate;
import com.holyw.duoduoke.template.jingdong.JingdongOrderTemplate;
import com.jd.open.api.sdk.JdClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

@ConditionalOnClass(JdClient.class)
@EnableConfigurationProperties({JingdongPropeties.class})
@Configuration
public class JingdongAutoConfiguration {

    @Bean
    public IClient jingdongClient(JingdongPropeties jingdongPropeties) throws ClientNotFoundException {
        IClient client;
        if (StringUtils.isEmpty(jingdongPropeties.getClientClassName())) {
            client = new DefaultJingdongClient(jingdongPropeties);
        } else {
            try {
                Class<IClient> clazz = (Class<IClient>) Class.forName(jingdongPropeties.getClientClassName());
                client = clazz.newInstance();
            } catch (IllegalAccessException e) {
                throw new ClientNotFoundException();
            } catch (InstantiationException e) {
                throw new ClientNotFoundException();
            } catch (ClassNotFoundException e) {
                throw new ClientNotFoundException();
            }
        }
        return client;

    }

    @Bean
    public JingdongSupportRepository jingdongSupportRepository(IClient client) {
        JingdongSupportRepository jingdongSupportRepository = new JingdongPrimaryProxy(client).getProxy(JingdongSupportRepository.class);
        return jingdongSupportRepository;
    }


    @Bean
    public JingdongGoodsTemplate jingdongGoodsTemplate(JingdongSupportRepository jingdongSupportRepository) {
        return new JingdongGoodsTemplate(jingdongSupportRepository);
    }

    @Bean
    public JingdongOrderTemplate jingdongOrderTemplate(JingdongSupportRepository jingdongSupportRepository) {
        return new JingdongOrderTemplate(jingdongSupportRepository);
    }

//    @Bean
//    public DuoduokeOrderTemplate pddOrderTemplate(DuoduokeSupportRepository duoduokeSupportRepository) {
//        return new DuoduokeOrderTemplate(duoduokeSupportRepository);
//    }

}

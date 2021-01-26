package com.holyw.duoduoke.exception;

import com.holyw.duoduoke.config.DuoduokeAutoConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @className: DuoduokeClientNotFoundException
 * @description: TODO
 * @author: Denchy Chiang
 * @date: 2021/1/11
 **/
public class DuoduokeClientNotFoundException extends Exception {
    private static final Logger log = LoggerFactory.getLogger(DuoduokeAutoConfiguration.class);

    public DuoduokeClientNotFoundException() {
        super();
        log.info("没有找到Client自定义实现类...");
    }
}

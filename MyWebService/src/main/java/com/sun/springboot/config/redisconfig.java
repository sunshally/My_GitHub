package com.sun.springboot.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
@PropertySource(value = { "classpath:application.properties" })
public class redisconfig {
    private Logger logger = LoggerFactory.getLogger(redisconfig.class);

    @Value("${spring.redis.host}")
    private String host;

    @Value("${spring.redis.port}")
    private int port;

    @Value("${spring.redis.password}")
    private String password;

    @Value("${spring.redis.timeout}")
    private int timeout;

    @Bean
    public JedisPool getJedisPool() {
        logger.info("==>初始化jedis连接池");
        JedisPoolConfig jedispoolconfig = new JedisPoolConfig();
        logger.info("==>建立jedis连接，host: " + host + "port: " + port);
        JedisPool pool = new JedisPool(jedispoolconfig, host, port,timeout,password);
        return pool;
    }

}

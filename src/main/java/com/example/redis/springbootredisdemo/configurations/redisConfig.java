package com.example.redis.springbootredisdemo.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class redisConfig {
    @Bean
    LettuceConnectionFactory lettuceConnectionFactory(){

        return new LettuceConnectionFactory();
    }
    @Bean
    RedisTemplate redisTemplate(LettuceConnectionFactory lettuceConnectionFactory){
        RedisTemplate redisTemplate=new RedisTemplate();
        redisTemplate.setConnectionFactory(lettuceConnectionFactory);
        return redisTemplate;
    }
}

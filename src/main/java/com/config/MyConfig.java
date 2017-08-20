package com.config;

import com.bean.JackImpl;
import com.bean.PersonI;
import com.bean.TomImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zyjzy on 2017/8/20.
 */

@Configuration
@ComponentScan
public class MyConfig {

    @Bean
    public PersonI personI() {
        if ("tom".equals(name))
            return new TomImpl();
        if ("jack".equals(name))
            return new JackImpl();
        return null;
    }

    @Autowired
    @Value("${Person.name}")
    private String name;
}

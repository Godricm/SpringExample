package com.tutorialspoint;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(initMethod = "init",destroyMethod = "cleanup")
    @Scope("property")
    public Foo foo(){
        return new Foo(bar());
    }

    @Bean
    public Bar bar(){
        return new Bar();
    }


}

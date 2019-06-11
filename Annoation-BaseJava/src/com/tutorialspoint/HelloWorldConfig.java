package com.tutorialspoint;

import org.springframework.context.annotation.*;

/**
 *<bean id="helloWorld" class="com.tutorlialspoint.HelloWorld"></bean>
 * */

@Configuration
public class HelloWorldConfig {

    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
}


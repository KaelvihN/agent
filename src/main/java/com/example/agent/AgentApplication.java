package com.example.agent;

import com.example.agent.service.MyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class AgentApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                SpringApplication.run(AgentApplication.class, args);
        MyService myService = context.getBean(MyService.class);
        log.info("MyService的class为={}",myService.getClass());
        myService.foo();

    }
}

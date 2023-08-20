package com.example.agent.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author : KaelvihN
 * @date : 2023/8/20 23:36
 */

@Aspect
@Slf4j
public class MyAspect {

    @Before("execution(* com.example.agent.service.MyService.*())")
    public void before(){
        log.info("before...");
    }
}

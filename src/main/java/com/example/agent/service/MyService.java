package com.example.agent.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author : KaelvihN
 * @date : 2023/8/20 23:38
 */


@Service
@Slf4j
public class MyService {
    public void foo(){
        log.info("foo...");
        hub();
    }

    public void hub(){
        log.info("hub...");
    }

}

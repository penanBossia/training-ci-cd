package com.training.springboot.test;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class TestClass {
    @PostConstruct
    public static void testing() {
        log.info("Titiiiiiiiii");
    }
}

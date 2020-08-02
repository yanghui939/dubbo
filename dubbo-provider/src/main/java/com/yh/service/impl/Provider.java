package com.yh.service.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 测试生产者是否成功
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext(
           new String[]{"classpath:dubbo-provider.xml"}
        );
        context.start();
        System.out.println("Provider start");
        System.in.read();
    }
}

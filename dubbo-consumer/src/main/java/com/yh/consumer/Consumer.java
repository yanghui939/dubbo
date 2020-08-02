package com.yh.consumer;

import com.yh.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 消费者
 * 案例
 */
public class Consumer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext(
                new String[]{"classpath:dubbo-consumer.xml"}
        );
        context.start();
        UserService userService = context.getBean(UserService.class);
        System.out.println(userService.hello());
        System.in.read();
    }
}

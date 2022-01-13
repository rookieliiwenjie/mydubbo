package com.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class EchoPrivder {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("echo-provider.xml");
        classPathXmlApplicationContext.start();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

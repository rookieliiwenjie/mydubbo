package com.consumer.client;

import com.api.EchoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EchoConsumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("echo-consumer.xml");
        classPathXmlApplicationContext.start();
        EchoService echoService = (EchoService) classPathXmlApplicationContext.getBean("echoService");
        String consrmer = echoService.echo("xdfdfdfd");
        System.out.println(consrmer);

    }
}

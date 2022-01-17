package com.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.server.EchoService;
import javafx.application.Application;
import javafx.stage.Stage;
@Service
public class EchoServiceImpl implements EchoService {


    @Override
    public String getMessage(String message) {
        System.out.println("message anntation = " + message);
        return message;
    }
}

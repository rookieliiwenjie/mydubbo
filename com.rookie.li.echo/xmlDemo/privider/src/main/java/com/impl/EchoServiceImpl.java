package com.impl;

import com.api.EchoService;

public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String message) {
        System.out.println("message = " + message);
        return message;
    }
}

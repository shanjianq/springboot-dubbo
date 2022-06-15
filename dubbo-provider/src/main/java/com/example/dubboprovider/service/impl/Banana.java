package com.example.dubboprovider.service.impl;

import com.example.service.Fruit;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(group = "banana")
public class Banana implements Fruit {

    @Override
    public String getFruitName() {
        return "banana";
    }
}

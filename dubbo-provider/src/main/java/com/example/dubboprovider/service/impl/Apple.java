package com.example.dubboprovider.service.impl;

import com.example.service.Fruit;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

@Service
@DubboService(group = "apple")
public class Apple implements Fruit {
    @Override
    public String getFruitName() {
        return "apple";
    }
}

package com.example.dubboconsumer.controller;

import com.example.service.Fruit;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @DubboReference(group = "apple")
    private Fruit apple;

    @DubboReference(group = "banana")
    private Fruit banana;

    @GetMapping("/apple")
    public String test(){
        return apple.getFruitName();
    }

    @GetMapping("/banana")
    public String test2(){
        return banana.getFruitName();
    }
}

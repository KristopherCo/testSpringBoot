package com.pinyougou.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Quick2Controller {
    @Value("${name}")
    private String name;

    @Value("${person.score}")
    private String score;

    @RequestMapping("/quick2")
    public String quick() {
        return "name:" + name+score;
    }
}

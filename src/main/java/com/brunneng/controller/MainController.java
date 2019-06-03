package com.brunneng.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MainController {

    @RequestMapping("/")
    public void recieveData(@RequestBody Map<String, Object> payload) {
        System.out.println("payload:");
        System.out.println(payload);
    }

}

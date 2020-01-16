package com.project.poll.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContoller {

@RequestMapping("/")
    public String index(){
    return "Greeting!!!";
}

}

/*
 * Copyright 2007-2020 Thomson Reuters Global Resources. All rights reserved. Proprietary and confidential information of TRGR.
 * Disclosure, use, or reproduction without the written authorisation of TRGR is prohibited. : HelloContoller.java 100473
 * 1/16/2020 2:36 PM:24Z Mykola_Filimonov $
 */

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

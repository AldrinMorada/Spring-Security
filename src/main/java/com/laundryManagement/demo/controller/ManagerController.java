package com.laundryManagement.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/store-manager")
public class ManagerController {

    @GetMapping("/")
    public String getIndex(){
        return "manager/index";
    }
}

package com.laundryManagement.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/")
    public String getIndex() {
        return "admin/index";
    }

    @GetMapping("/users")
    public String getUsers() {
        return "admin/user";
    }

}

package com.laundryManagement.demo.controller;

import com.laundryManagement.demo.model.User;
import com.laundryManagement.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    UserRepository userRepo;

    @GetMapping("/")
    public String getIndex() {
        return "admin/index";
    }

    @GetMapping("/users")
    public String getUsers(Model m) {
        List<User> users = userRepo.findAll();
        m.addAttribute("users", users);
        return "admin/user";
    }

}

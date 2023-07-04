package com.example.thuctap1.controller;

import com.example.thuctap1.model.User;
import com.example.thuctap1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String ge(){
        return "test";
    }


    @GetMapping("/get")
    public List<User> getUser(){
        return userService.selectUser();
    }


    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }


    @PutMapping("/edit")
    public User editUder(@RequestParam("id") long id,@RequestBody User user){
        return  userService.editUser(id,user);
    }


    @DeleteMapping("/delete/{id}")
    public boolean deleteUser(@PathVariable("id") long id){
        return userService.deleteUser(id);
    }


}

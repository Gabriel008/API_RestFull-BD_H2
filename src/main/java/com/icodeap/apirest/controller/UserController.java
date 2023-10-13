package com.icodeap.apirest.controller;

import com.icodeap.apirest.model.User;
import com.icodeap.apirest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user){
      return  userService.createsuser(user);
    }

    @GetMapping
    public List<User> getAllUser(){
        return  userService.getAllUsers();
    }

    @GetMapping("{id}")
    public User searuserById(@PathVariable("id") Long id){
        return  userService.getuserById(id);
    }

    @DeleteMapping("{id}")
    public void deleteUserById(@PathVariable("id") List<Long> id){
        userService.deleteUsers(id);
    }
}

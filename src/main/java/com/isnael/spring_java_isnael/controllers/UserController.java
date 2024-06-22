package com.isnael.spring_java_isnael.controllers;



import com.isnael.spring_java_isnael.entites.User;
import com.isnael.spring_java_isnael.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private UserRepository Repository;
    @GetMapping
    public List<User> findAll(){
         List<User> result = Repository.findAll();
         return result;
    }
    @GetMapping(value = "/{id}")
    public User findById(@PathVariable long id){
        User result = Repository.findById(id).get();
        return result;
    }
    @PostMapping
    public User create(@RequestBody User user){
        User result = Repository.save(user);
        return result;
    }
}

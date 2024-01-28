package com.twitterlike.API.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twitterlike.API.models.UserModel;
import com.twitterlike.repositories.UserRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/users")
public class UserController {

  final UserRepository userRepository;
   UserController(UserRepository userRepository){
       this.userRepository = userRepository;
   }

  @PostMapping()
  public void createUser(@RequestBody UserModel entity) {

    userRepository.save(entity);

  }
  
  
}

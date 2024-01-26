package com.twitterlike.API.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/users")
public class UserController {

  @PostMapping()
  public void postMethodName(@RequestBody String entity) {
      //TODO: process POST request
      System.out.println(entity);
  }
  
  
}

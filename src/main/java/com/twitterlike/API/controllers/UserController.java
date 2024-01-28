package com.twitterlike.API.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twitterlike.API.dtos.UserDTO;
import com.twitterlike.API.models.UserModel;
import com.twitterlike.repositories.UserRepository;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/users")
public class UserController {

  final UserRepository userService;

  UserController(UserRepository userRepository) {
    this.userService = userRepository;
  }

  @PostMapping()
  public ResponseEntity<UserModel> createUser(@RequestBody @Valid UserDTO userDto) {
    UserModel user = userService.save(userDto);
    return ResponseEntity.status(HttpStatus.CREATED).body(user);
  }

}

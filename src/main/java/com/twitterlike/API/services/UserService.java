package com.twitterlike.API.services;

import org.springframework.stereotype.Service;

import com.twitterlike.API.models.UserModel;
import com.twitterlike.repositories.UserRepository;

@Service
public class UserService {
  final UserRepository userRepository;

  UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public UserModel save(UserModel user) {
    return userRepository.save(user);
  }

}

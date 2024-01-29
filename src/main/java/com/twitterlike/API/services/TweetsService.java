package com.twitterlike.API.services;

import java.util.List;
import java.util.Optional;

import com.twitterlike.API.dtos.TweetDTO;
import com.twitterlike.API.models.TweetsModel;
import com.twitterlike.API.models.UserModel;
import com.twitterlike.repositories.TweetsRepository;
import com.twitterlike.repositories.UserRepository;

public class TweetsService {
  final TweetsRepository tweetsRepository;
  final UserRepository userRepository;

  TweetsService(TweetsRepository tweetsRepository, UserRepository userRepository) {
    this.tweetsRepository = tweetsRepository;
    this.userRepository = userRepository;
  }

  public Optional<TweetsModel> save(TweetDTO entity) {
    Optional<UserModel> user = userRepository.findByUsername(entity.getUserId());
    if (user.isEmpty()) {
      return Optional.empty();
    }
    return tweetsRepository.save(entity);
  }

  public List<TweetsModel> findAll() {
    return tweetsRepository.findAll();
  }

}

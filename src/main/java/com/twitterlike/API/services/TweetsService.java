package com.twitterlike.API.services;

import com.twitterlike.API.models.TweetsModel;
import com.twitterlike.repositories.TweetsRepository;

public class TweetsService {
  final TweetsRepository tweetsRepository;

  TweetsService(TweetsRepository tweetsRepository) {
    this.tweetsRepository = tweetsRepository;
  }

  public TweetsModel save(TweetsModel tweetsModel) {
    return tweetsRepository.save(tweetsModel);
  }
  
}

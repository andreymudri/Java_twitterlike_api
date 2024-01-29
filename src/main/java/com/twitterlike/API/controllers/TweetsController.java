package com.twitterlike.API.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twitterlike.API.dtos.TweetDTO;
import com.twitterlike.API.models.TweetsModel;
import com.twitterlike.API.services.TweetsService;

import java.util.List;
import java.util.Optional;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/tweets")
public class TweetsController {

  final TweetsService tweetsService;

  TweetsController(TweetsService tweetsService) {
    this.tweetsService = tweetsService;
  }

  @PostMapping()
  public ResponseEntity<Optional<TweetsModel>> postMethodName(@RequestBody TweetDTO entity) {
    Optional<TweetsModel> tweet = tweetsService.save(entity);
    return ResponseEntity.status(HttpStatus.CREATED).body(tweet);
  }

  @GetMapping()
  public List<TweetsModel> getMethodName() {
    return tweetsService.findAll();
  }

  

}

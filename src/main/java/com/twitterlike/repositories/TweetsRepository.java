package com.twitterlike.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twitterlike.API.dtos.TweetDTO;
import com.twitterlike.API.models.TweetsModel;

@Repository
public interface TweetsRepository extends JpaRepository<TweetsModel, Long> {

  Optional<TweetsModel> save(TweetDTO entity);

}

package com.twitterlike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twitterlike.API.models.PostModel;

@Repository
public interface TweetsRepository extends JpaRepository<PostModel, Long> {

}

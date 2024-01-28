package com.twitterlike.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twitterlike.API.models.UserModel;


@Repository
public interface UserRepository extends JpaRepository<UserModel, UUID>{

  UserModel findByUsername(String username);
}
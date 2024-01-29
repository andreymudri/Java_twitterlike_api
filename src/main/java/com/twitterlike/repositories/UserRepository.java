package com.twitterlike.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twitterlike.API.dtos.UserDTO;
import com.twitterlike.API.models.UserModel;

import jakarta.validation.Valid;

@Repository
public interface UserRepository extends JpaRepository<UserModel, UUID> {

  UserModel findByUsername(String username);

  UserModel save(@Valid UserDTO userDto);

  Optional<UserModel> findByUsername(UserModel userId);

}
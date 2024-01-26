package com.twitterlike.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twitterlike.API.models.UserModel;


@Repository
public interface UserRepository extends JpaRepository<UserModel, Long>{

  UserModel findByUsername(String username);
}
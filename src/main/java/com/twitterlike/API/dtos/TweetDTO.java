package com.twitterlike.API.dtos;

import com.twitterlike.API.models.UserModel;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class TweetDTO {

  @NotBlank(message = "User cannot be blank")
  private UserModel userId;

  @NotBlank(message = "Text cannot be blank")
  private String text;
}

package com.twitterlike.API.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserDTO {
  @NotBlank(message = "Username cannot be blank")
  private String username;

  @NotBlank(message = "Avatar cannot be blank")
  private String avatar;
}

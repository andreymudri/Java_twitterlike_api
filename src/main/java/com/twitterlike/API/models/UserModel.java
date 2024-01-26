package com.twitterlike.API.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class UserModel {
  
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private Long id;

  @Column(unique = true, nullable = false)
  private String username;

  @Column
  private String avatar;

}

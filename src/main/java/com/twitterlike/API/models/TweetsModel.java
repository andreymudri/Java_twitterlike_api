package com.twitterlike.API.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tweets")
public class TweetsModel {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "userId")
  private UserModel userId;

  @Column
  private String text;
}

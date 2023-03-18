package com.heroleggo.springsimpleboard.post.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class CreatePostDto {
  private String name;

  private String contents;

  private String author;
}

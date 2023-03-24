package com.heroleggo.springsimpleboard.auth.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class LoginDto {
  private String name;

  private String password;
}

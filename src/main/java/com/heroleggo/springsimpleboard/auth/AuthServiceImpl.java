package com.heroleggo.springsimpleboard.auth;

import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

  @Override
  public boolean login(String username, String password) {
    return false;
  }
}

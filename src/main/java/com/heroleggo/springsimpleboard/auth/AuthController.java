package com.heroleggo.springsimpleboard.auth;

import com.heroleggo.springsimpleboard.auth.dto.LoginDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/auth")
public class AuthController {

  private final AuthService authService;

  @GetMapping
  public ResponseEntity<?> getMyInfo() {
    return ResponseEntity.status(200).body("hehe");
  }

  @PostMapping("/login")
  public ResponseEntity<?> login(@RequestBody LoginDto body) {
    boolean result = this.authService.login(body.getName(), body.getPassword());
    return result ? ResponseEntity.status(200).body("success")
        : ResponseEntity.status(401).body("Unauthorized");
  }
}

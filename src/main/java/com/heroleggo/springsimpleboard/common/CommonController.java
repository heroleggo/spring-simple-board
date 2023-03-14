package com.heroleggo.springsimpleboard.common;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/")
public class CommonController {
  @GetMapping("/")
  public ResponseEntity<?> getServerStatus() {
    return ResponseEntity.status(200).body("OK");
  }
}

package com.heroleggo.springsimpleboard.board;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/boards")
public class BoardController {
  @GetMapping("/{boardId}")
  public ResponseEntity<?> getBoardInfo(@PathVariable Integer boardId) {
    String boardInfo = "board ID : " + boardId.toString();
    return ResponseEntity.status(200).body(boardInfo);
  }
}

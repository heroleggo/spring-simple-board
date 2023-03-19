package com.heroleggo.springsimpleboard.board;

import com.heroleggo.springsimpleboard.board.dto.CreateBoardDto;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/boards")
public class BoardController {

  private final BoardService boardService;

  @GetMapping
  public ResponseEntity<?> getBoardList() {
    String[] boardList = this.boardService.getBoardList();
    return ResponseEntity.status(200).body(boardList);
  }

  @GetMapping("/{boardId}")
  public ResponseEntity<?> getBoardInfo(@PathVariable Integer boardId) {
    String boardInfo = this.boardService.getBoard(boardId);
    return ResponseEntity.status(200).body(boardInfo);
  }

  @PostMapping()
  public ResponseEntity<?> createBoard(@RequestBody CreateBoardDto body) {
    System.out.println(body.getBoardName());
    return ResponseEntity.status(201).body("created");
  }
}

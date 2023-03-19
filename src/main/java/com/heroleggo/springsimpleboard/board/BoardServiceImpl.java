package com.heroleggo.springsimpleboard.board;

import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

  @Override
  public void createBoard(String boardId) {
    return;
  }

  @Override
  public String[] getBoardList() {
    return new String[]{"board1", "board2"};
  }

  public String getBoard(Integer boardId) {
    return boardId.toString();
  }
}

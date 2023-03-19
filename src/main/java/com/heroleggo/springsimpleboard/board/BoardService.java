package com.heroleggo.springsimpleboard.board;

public interface BoardService {

  public void createBoard(String boardId);

  public String[] getBoardList();

  public String getBoard(Integer boardId);

}

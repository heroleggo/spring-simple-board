package com.heroleggo.springsimpleboard.post;

public interface PostService {
  public void createPost(String postId);

  public String[] getPostListByBoardId(String boardId);

  public String getPostByPostId(Integer postId);
}

package com.heroleggo.springsimpleboard.post;

import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

  @Override
  public void createPost(String postId) {
    return;
  }

  @Override
  public String[] getPostListByBoardId(String boardId) {
    return new String[]{"post1", "post2"};
  }

  @Override
  public String getPostByPostId(Integer postId) {
    String[] posts = {"post1", "post2"};
    for (String post : posts) {
      if (post.endsWith(postId.toString())) {
        return post;
      }
    }
    return "";
  }
}

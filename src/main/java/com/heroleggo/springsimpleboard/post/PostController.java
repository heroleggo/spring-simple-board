package com.heroleggo.springsimpleboard.post;

import com.heroleggo.springsimpleboard.post.dto.CreatePostDto;
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
@RequestMapping("/posts")
public class PostController {
  private final PostService postService;
  private final String[] posts = new String[]{
      "post1",
      "post2",
      "post3"
  };

  @GetMapping("")
  public ResponseEntity<?> getPosts() {
    return ResponseEntity.status(200).body(this.posts);
  }

  @GetMapping("/boards/{boardId}")
  public ResponseEntity<?> getPostListByBoardId(@PathVariable String boardId) {
    String[] postList = this.postService.getPostListByBoardId(boardId);
    return ResponseEntity.status(200).body(postList);
  }

  @GetMapping("/{postId}")
  public ResponseEntity<?> getPostByPostId(@PathVariable Integer postId) {
    String post = this.postService.getPostByPostId(postId);
    return ResponseEntity.status(200).body(post);
  }

  @PostMapping
  public ResponseEntity<?> saveNewPost(@RequestBody CreatePostDto body) {
    this.postService.createPost(body.getName());
    System.out.println(body.getName());
    return ResponseEntity.status(201).body("Created");
  }
}

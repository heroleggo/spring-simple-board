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
  final private String[] posts = new String[]{
      "post1",
      "post2",
      "post3"
  };

  @GetMapping("")
  public ResponseEntity<?> getPosts() {
    return ResponseEntity.status(200).body(this.posts);
  }

  @GetMapping("/{postId}")
  public ResponseEntity<?> getPostByPostId(@PathVariable Integer postId) {
    if (postId < this.posts.length) {
      return ResponseEntity.status(200).body(this.posts[postId]);
    }
    return ResponseEntity.status(404).body("Not Found");
  }

  @PostMapping
  public ResponseEntity<?> saveNewPost(@RequestBody CreatePostDto body) {
    System.out.println(body.getName());
    return ResponseEntity.status(201).body("Created");
  }
}

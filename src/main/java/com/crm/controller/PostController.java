package com.crm.controller;

import com.crm.entity.Post;
import com.crm.service.PostService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {

    public PostService postService;

    public PostController(PostService postService){
        this.postService=postService;
    }

    @PostMapping
    public String addPost(@RequestBody Post post){
        postService.addPost(post);
       return "Post added";
    }

    @DeleteMapping
    public String deletePost(){
        postService.deletePost();
        return "Post deleted successfully";
    }


}

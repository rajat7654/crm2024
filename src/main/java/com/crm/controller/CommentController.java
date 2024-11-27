package com.crm.controller;

import com.crm.entity.Comment;
import com.crm.service.CommentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {

    public CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService=commentService;
    }

    @PostMapping
    public String addComment(@RequestBody Comment comment, @RequestParam Long postId) {
        commentService.addComment(comment,postId);
        return "Comment added successfully";
    }





}

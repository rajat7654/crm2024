package com.crm.service;

import com.crm.entity.Comment;
import com.crm.entity.Post;
import com.crm.repository.CommentRepository;
import com.crm.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    public CommentRepository commentRepository;
    public PostRepository postRepository;

    public CommentService(CommentRepository commentRepository,PostRepository postRepository) {
        this.commentRepository=commentRepository;
        this.postRepository=postRepository;
    }


    public void addComment(Comment comment, Long postId) {
        Post post = postRepository.findById(postId).get();
        comment.setPost(post);
        commentRepository.save(comment);

    }
}

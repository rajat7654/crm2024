package com.crm.service;

import com.crm.entity.Post;
import com.crm.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    public PostRepository postRepository;

    public PostService(PostRepository postRepository){
        this.postRepository= postRepository;
    }


    public void addPost(Post post) {
        postRepository.save(post);

    }

    public void deletePost() {
        postRepository.deleteById(1L);
    }
}

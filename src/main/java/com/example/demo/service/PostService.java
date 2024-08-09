package com.example.demo.service;

import com.example.demo.entities.Post;

import java.util.List;

public interface PostService {
    String addpost(Post post);

    List<Post> getAllPost();
}

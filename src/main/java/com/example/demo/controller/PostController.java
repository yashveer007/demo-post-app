package com.example.demo.controller;

import com.example.demo.entities.Post;
import com.example.demo.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class PostController {

    @Autowired
    private PostService service;

    @GetMapping("/getAllPost")
    public ResponseEntity<List<Post>> getAllPost(){
        log.info("inside controller");
        List<Post> allPost = service.getAllPost();
        log.info("posts: "+ allPost);
        return  new ResponseEntity<>(allPost, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addPost(@RequestBody Post post){
        String addpost = service.addpost(post);
        return  new ResponseEntity<>(addpost, HttpStatus.OK);
    }

}

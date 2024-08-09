package com.example.demo.service;

import com.example.demo.dao.PostDao;
import com.example.demo.entities.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private PostDao dao;
    @Override
    public String addpost(Post post) {
        try{
            Post save = dao.save(post);
        }catch (Exception ex){
            throw  new RuntimeException(ex);
        }
        return "post save successfully";
    }

    @Override
    public List<Post> getAllPost() {
        try{
            List<Post> all = dao.findAll();
            return all;
        }catch (Exception ex){
            throw  new RuntimeException(ex);
        }
    }
}

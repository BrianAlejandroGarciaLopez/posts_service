package com.designpatterns.postsservice.controller;

import com.designpatterns.postsservice.entity.Post;
import com.designpatterns.postsservice.repository.IPostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostsController {
    @Autowired
    private IPostsRepository repository;

    @Value("${server.port}")
    private String port;


    @GetMapping("/{userId}")
    private List<Post> getPostsByUserId(@PathVariable Integer userId){
        System.out.println("Currently at port: " + port);

        return repository.findByUserId(userId);
    }
}

package com.designpatterns.postsservice.repository;

import com.designpatterns.postsservice.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPostsRepository extends JpaRepository<Post, Integer> {
    List<Post> findByUserId(Integer userId);
}

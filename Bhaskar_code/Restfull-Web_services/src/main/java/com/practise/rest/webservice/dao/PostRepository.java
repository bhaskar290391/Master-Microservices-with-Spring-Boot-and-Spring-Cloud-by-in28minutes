package com.practise.rest.webservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practise.rest.webservice.entity.Posts;

@Repository
public interface PostRepository extends JpaRepository<Posts, Integer> {

}

package com.practise.rest.webservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practise.rest.webservice.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

}

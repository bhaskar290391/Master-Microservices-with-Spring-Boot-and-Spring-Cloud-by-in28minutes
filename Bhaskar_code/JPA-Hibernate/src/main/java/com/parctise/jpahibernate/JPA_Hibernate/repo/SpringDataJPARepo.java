package com.parctise.jpahibernate.JPA_Hibernate.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parctise.jpahibernate.JPA_Hibernate.entity.Course;

@Repository
public interface SpringDataJPARepo extends JpaRepository<Course	, Long> {

}

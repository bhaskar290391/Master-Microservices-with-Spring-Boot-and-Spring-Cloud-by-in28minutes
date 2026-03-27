package com.parctise.jpahibernate.JPA_Hibernate.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.parctise.jpahibernate.JPA_Hibernate.entity.Course;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class JpaEntityManager {

	@Autowired
	private EntityManager template;

	public void save(Course course) {
		template.merge(course);

	}

	public void deleteById(long id) {

		Course data = template.find(Course.class, id);
		template.remove(data);
	}

	public Course findById(long id) {
		return template.find(Course.class, id);
	}
}

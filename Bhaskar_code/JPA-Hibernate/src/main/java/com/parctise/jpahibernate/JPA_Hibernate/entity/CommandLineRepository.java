package com.parctise.jpahibernate.JPA_Hibernate.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.parctise.jpahibernate.JPA_Hibernate.repo.SpringJDBCRepo;

@Component
public class CommandLineRepository implements CommandLineRunner {

	@Autowired
	private SpringJDBCRepo springJDBCRepo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		springJDBCRepo.insert(new Course(1, "Learn AWS", "In 28 minutes"));
		springJDBCRepo.insert(new Course(2, "Learn Java", "Udemy"));
		springJDBCRepo.insert(new Course(3, "Learn Springboot", "Durga soft"));
		
		
		springJDBCRepo.delete(1l);
	}

}

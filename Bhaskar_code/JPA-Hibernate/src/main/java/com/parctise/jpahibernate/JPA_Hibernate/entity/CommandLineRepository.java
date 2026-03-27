package com.parctise.jpahibernate.JPA_Hibernate.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.parctise.jpahibernate.JPA_Hibernate.repo.JpaEntityManager;

@Component
public class CommandLineRepository implements CommandLineRunner {

	/*
	 * @Autowired private SpringJDBCRepo springJDBCRepo;
	 */

	/*
	 * @Autowired private
	 * com.parctise.jpahibernate.JPA_Hibernate.repo.SpringDataJPARepo
	 * SpringDataJPARepo;
	 */

	@Autowired
	private JpaEntityManager manager;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		manager.save(new Course(1, "Learn AWS", "In 28 minutes"));
		manager.save(new Course(2, "Learn Java", "Udemy"));
		manager.save(new Course(3, "Learn Springboot", "Durga soft"));

		manager.deleteById(1l);

		System.out.println(manager.findById(2l));
		System.out.println(manager.findById(3l));
	}

}

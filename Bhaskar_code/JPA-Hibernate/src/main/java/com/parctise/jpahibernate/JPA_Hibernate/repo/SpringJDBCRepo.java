package com.parctise.jpahibernate.JPA_Hibernate.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.parctise.jpahibernate.JPA_Hibernate.entity.Course;

@Repository
public class SpringJDBCRepo {

	@Autowired
	private JdbcTemplate template;

	public static String INSERT_QUERY = """
			INSERT INTO COURSE(ID, NAME,AUTHOR) VALUES (?,?,?)
			""";

	public static String DELETE_QUERY = """
			DELETE FROM COURSE WHERE ID =?
			""";

	public void insert(Course course) {
		template.update(INSERT_QUERY, course.getId(),course.getName(),course.getAuthor());

	}

	public void delete(long id) {
		template.update(DELETE_QUERY,id);

	}
}

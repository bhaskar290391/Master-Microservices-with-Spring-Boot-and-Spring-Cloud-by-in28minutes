package com.parctise.jpahibernate.JPA_Hibernate.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
	
	public static String SELECT_QUERIES="""
			SELECT * from COURSE WHERE ID=? 
			""";

	public void save(Course course) {
		template.update(INSERT_QUERY, course.getId(),course.getName(),course.getAuthor());

	}

	public void deleteById(long id) {
		template.update(DELETE_QUERY,id);
	}
	
	@SuppressWarnings("unchecked")
	public Course findById(long id) {
		Course query = (Course) template.queryForObject(SELECT_QUERIES, new BeanPropertyRowMapper(Course.class), id);
		
		return  query;
	}
}

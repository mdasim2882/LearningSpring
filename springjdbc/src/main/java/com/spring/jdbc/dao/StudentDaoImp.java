package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

public class StudentDaoImp implements StudentDao {

	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int insert(Student student) {
		//TODO Insert query
		String query = "INSERT INTO Student(id,name,city) values(?,?,?)";
		int rowsAffected = this.template.update(query, student.getId(), student.getName(), student.getCity());
		return rowsAffected;
	}

	public int change(Student student) {
		//TODO Update Query
		String query = "Update Student set name = ?, city =? where id = ?";
		int rowsAffected = this.template.update(query, student.getName(), student.getCity(), student.getId());
		return rowsAffected;
	}

	public int delete(int studentId) {
		//TODO Delete Query
		String query = "DELETE from Student where id = ?";
		int rowsAffected = this.template.update(query, studentId);
		return rowsAffected;
	}

	
	public Student select(int studentId)
	{
		// TODO Performing SELECT Query
		String query = "SELECT * from Student where id = ?";
		
		// Here RowMapper mapRow(..) gets called automatically due to run-time polymorphism
		RowMapper<Student> rowMapper = new RowMapperImp();
		Student queryResult = this.template.queryForObject(query,rowMapper,studentId);
		
		
		return queryResult;
	}

	public List<Student> getAllObjects() {
		// TODO Fetching all list objects
		String query = "SELECT * from Student";
		
		RowMapper<Student> rowMapper = new RowMapperImp();
		List<Student> listObjectStudents = this.template.query(query,rowMapper);
		return listObjectStudents;
	}
}

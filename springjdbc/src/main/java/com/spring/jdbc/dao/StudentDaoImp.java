package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

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
		// Insert query
		String query = "INSERT INTO Student(id,name,city) values(?,?,?)";
		int rowsAffected = this.template.update(query, student.getId(), student.getName(), student.getCity());
		return rowsAffected;
	}

	public int change(Student student) {
		// Update Query
		String query = "Update Student set name = ?, city =? where id = ?";
		int rowsAffected = this.template.update(query, student.getName(), student.getCity(), student.getId());
		return rowsAffected;
	}

	public int delete(int studentId) {
		// Delete Query
		String query = "DELETE from Student where id = ?";
		int rowsAffected = this.template.update(query, studentId);
		return rowsAffected;
	}

}

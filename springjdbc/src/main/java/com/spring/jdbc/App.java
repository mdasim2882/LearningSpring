package com.spring.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImp;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		System.out.println("Starting JDBC program...");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");

		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);

		/*
		 * USUAL WAY but not a RECOMMENDED one // Writing query String query =
		 * "INSERT INTO Student(id,name,city) values(?,?,?)";
		 * 
		 * // Firing query 
		 * int rowsAffected = template.update(query, 223, "Travis", "London");
		 *  System.out.println("Rows affected = "+ rowsAffected);
		 */

		// RECOMMENDED way is to use Design Patterns + SQLyog
		// INSERTING...
//		StudentDao studentDao = context.getBean("studentdao",StudentDao.class);
//		Student student = new Student();
//		student.setId(343);
//		student.setName("Nitesh");
//		student.setCity("Barabanki");		
//		int rowsAffected = studentDao.insert(student);
//		System.out.println("Rows affected = "+ rowsAffected);

		// UPDATING...
//		StudentDao studentDao = context.getBean("studentdao",StudentDao.class);
//		Student student = new Student();
//		student.setId(333);
//		student.setName("Kane");
//		student.setCity("Texas");
//		
//		int rowsAffected = studentDao.change(student);
//		System.out.println("Rows affected = "+ rowsAffected);

		// DELETING...
//		StudentDao studentDao = context.getBean("studentdao", StudentDao.class);
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the student ID to be deleted: ");
//		int id = scanner.nextInt();
//		int rowsAffected = studentDao.delete(id);
		
		
		// SELECT QUERY ...
//		StudentDao studentDao = context.getBean("studentdao", StudentDao.class);
//		
//		System.out.println(studentDao.select(222));
		
		// GET ALL OBJECTS
		StudentDao studentDao = context.getBean("studentdao", StudentDao.class);
		
		List<Student> ls = studentDao.getAllObjects();
		for( Student s : ls)
			System.out.println(s);
		

	}
}

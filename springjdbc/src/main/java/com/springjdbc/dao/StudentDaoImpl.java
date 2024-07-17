package com.springjdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {
	private JdbcTemplate template;		
	@Override
	public int insert(Student student) {
		String query = " insert into student(id, name, city) values(?, ?, ?) ";
		int res = this.template.update(query, student.getId(), student.getName(), student.getCity());
		return res;
	}
	@Override
	public int update(Student student) {
		String query = " update student set name = ?, city = ? where id = ?";
		int res = this.template.update(query, student.getName(), student.getCity(), student.getId());
		return res;
	}
	@Override
	public int delete(Student student) {
		String query = " delete from student where id = ?";
		int res = this.template.update(query, student.getId());
		return res;
	}
	
	@Override
	public Student getStudent(int studentId) {
		// collect single student data
		String queryString = "select * from student where id = ?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.template.queryForObject(queryString, rowMapper, studentId);
		return student;
	}
	
	@Override
	public List<Student> getAllStudent() {
		// select multiple student
		String queryString = "select * from student";
		return this.template.query(queryString, new RowMapperImpl());		
	}
	
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	public JdbcTemplate getTemplate() {
		return template;
	}

	
}

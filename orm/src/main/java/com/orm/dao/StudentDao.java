package com.orm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.orm.entities.Student;

public class StudentDao {
	private HibernateTemplate template;
	// to save the student
	public int insert(Student s) {
		int res = (int)this.template.save(s);
		return res;
	}
	
	
}

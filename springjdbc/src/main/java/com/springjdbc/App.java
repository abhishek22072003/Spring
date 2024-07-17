package com.springjdbc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.support.SimpleTriggerContext;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My program started.................." );
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        StudentDao studentDao = (StudentDao)context.getBean("studentDao", StudentDao.class);
//        Student s = new Student(777, "Manish Patil", "Dubai");
//        int result = studentDao.delete(s);
//        System.out.println("The number of rows affected: "+result);
//        
//        System.out.println(studentDao.getStudent(56));
        
        List<Student> list = studentDao.getAllStudent();
        for(Student student : list)
        	System.out.println(student);
    }
}

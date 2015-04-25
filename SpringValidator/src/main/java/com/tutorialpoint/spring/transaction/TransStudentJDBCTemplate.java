package com.tutorialpoint.spring.transaction;

import java.util.List;

import javax.management.RuntimeErrorException;
import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class TransStudentJDBCTemplate implements TransStudentDao{
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource=dataSource;
		this.jdbcTemplateObject=new JdbcTemplate(dataSource);
		
	}
	

	public void create(String name, Integer age, Integer marks, Integer year) {
		try{
			 String SQL1 = "insert into Student (name, age) values (?, ?)";
	         jdbcTemplateObject.update( SQL1, name, age);

	         // Get the latest student id to be used in Marks table
	         String SQL2 = "select max(id) from Student";
	         int sid = jdbcTemplateObject.queryForInt( SQL2 );

	         String SQL3 = "insert into Marks(sid, marks, year) " + 
	                       "values (?, ?, ?)";
	         jdbcTemplateObject.update( SQL3, sid, marks, year);
	         System.out.println("Created Name = " + name + ", Age = " + age);
	         //throw new RuntimeException();
		}catch(DataAccessException e){
			 System.out.println("Error in creating record, rolling back");
	         throw e;
		}catch (RuntimeException e) {
			 System.out.println("DECLARATIVE TRANSACTION MANAGEMENT WORKED");
	         throw e;
		}
		//return;
	}

	public List<TransStudentMarks> listStudents() {
		String SQL = "select * from Student, Marks where Student.id=Marks.sid";

	      List <TransStudentMarks> studentMarks = jdbcTemplateObject.query(SQL, 
	                                         new TransStudentMarksMapper());
	      return studentMarks;
	}

}

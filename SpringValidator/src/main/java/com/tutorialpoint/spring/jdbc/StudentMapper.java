package com.tutorialpoint.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentMapper  implements org.springframework.jdbc.core.RowMapper<Student>{
	 public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
	      Student student = new Student();
	      student.setId(rs.getInt("id"));
	      student.setName(rs.getString("name"));
	      student.setAge(rs.getInt("age"));
	      return student;
	   }
}

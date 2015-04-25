package com.tutorialpoint.spring.transaction;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;



public class TransStudentMarksMapper implements RowMapper<TransStudentMarks>{

	public TransStudentMarks mapRow(ResultSet rs, int rowNum)
			throws SQLException {
		  TransStudentMarks studentMarks = new TransStudentMarks();

	      studentMarks.setId(rs.getInt("id"));
	      studentMarks.setName(rs.getString("name"));
	      studentMarks.setAge(rs.getInt("age"));
	      studentMarks.setSid(rs.getInt("sid"));
	      studentMarks.setMarks(rs.getInt("marks"));
	      studentMarks.setYear(rs.getInt("year"));

	      return studentMarks;
	}

}

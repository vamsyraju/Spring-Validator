package com.tutorialpoint.spring.transaction;

import java.util.List;

import javax.sql.DataSource;

public interface TransStudentDao {
	public void setDataSource(DataSource dataSource);
	public void create(String name,Integer age,Integer marks, Integer year);
	public List<TransStudentMarks> listStudents();
}

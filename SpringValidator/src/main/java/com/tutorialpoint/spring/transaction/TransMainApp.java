package com.tutorialpoint.spring.transaction;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransMainApp {
	 public static void main(String[] args) {
	      ApplicationContext context = 
	             new ClassPathXmlApplicationContext("Trans.xml");

	      TransStudentDao studentJDBCTemplate = 
	      (TransStudentDao)context.getBean("transStudentJDBCTemplate");
	      
	      System.out.println("------Records creation--------" );
	      studentJDBCTemplate.create("Zara", 11, 99, 2010);
	      studentJDBCTemplate.create("Nuha", 20, 97, 2010);
	      studentJDBCTemplate.create("Ayan", 25, 100, 2011);

	      System.out.println("------Listing all the records--------" );
	      List<TransStudentMarks> studentMarks = studentJDBCTemplate.listStudents();
	      for (TransStudentMarks record : studentMarks) {
	         System.out.print("ID : " + record.getId() );
	         System.out.print(", Name : " + record.getName() );
	         System.out.print(", Marks : " + record.getMarks());
	         System.out.print(", Year : " + record.getYear());
	         System.out.println(", Age : " + record.getAge());
	      }
}
}

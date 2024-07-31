package com.tarun.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.tarun.beans.Student;
import com.tarun.mappers.StudentRowMapper;
import com.tarun.resources.SpringConfig;

public class MainDemo {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
	    JdbcTemplate jdbcTemplate = 	context.getBean(JdbcTemplate.class);
	    
		
	    //------------------------------INSERT OPERATION--------------------------
//	    int std_roll_no = 104;
//	    String std_name = "Heera";
//	    float std_marks = 60.0f;
//	    
//	    
//	    String insert_sql_query = "INSERT INTO student  VALUES(?,?,?)";
//	   int n =  jdbcTemplate.update(insert_sql_query , std_roll_no , std_name , std_marks);
//	    if(n > 0)
//	    {
//	    	System.out.println("Insertion Succesfully...!");
//	    }
//	    else
//	    {
//	    	System.out.println("Insertion Failed...!");
//	    }
	    
	    
	    
	  //---------------------------------UPDATE OOPERATIONS--------------------------

//	    float marks  =98.5f;
//	    int roolno= 103;
//	    
//	    String update_sql_query = "UPDATE student SET  std_marks = ? WHERE std_roll=?";
//		   int n =  jdbcTemplate.update(update_sql_query , marks , roolno);
//		   if(n > 0)
//		   {
//		    	System.out.println("Updation Succesfully...!");
//		    }
//		    else
//		    {
//		    	System.out.println("Updation Failed...!");
//		    }
//	    
		  //-----------------------DELETE OPERATIONS------------------------------------

//			int rollno = 104;
//			
//			String delete_sql_query = "DELETE FROM student WHERE std_roll=? ";
//			int count = jdbcTemplate.update(delete_sql_query , rollno );
//			if(count > 0)
//			{
//				System.out.println("Deletion successfully");
//			}
//			else
//			{
//				System.out.println("Deletion failed");
//			}

	    
	  //---------------------------------SELECT OOPERATIONS--------------------------
//	    String select_sql_query = "SELECT * FROM student";
//	   //query(sql_select_query   ,   RowMapper <T> rowmapper ) 
//	   List<Student> std_list =   jdbcTemplate.query(select_sql_query, new StudentRowMapper());
//	   
//	   for(Student std  :std_list)
//	   {
//		   System.out.println("Roll no :-"+std.getRoll_no());
//		   System.out.println("Name :-"+std.getName());
//		   System.out.println("Marks :-"+std.getMarks());
//		   	System.out.println("----------------------------------------------------------------------");
//	   }
//	   
	    
	    
	    
	 //if u wanted to get only specific data 
		
	 //---------------------------------SELECT OOPERATIONS 2 with Specific data--------------------------
	   
	    int rollno = 101;
	    String select_sql_query = "SELECT * FROM student WHERE std_roll=? ";
		   //query(sql_select_query   ,   RowMapper <T> rowmapper ) 
		   Student  std=   jdbcTemplate.queryForObject(select_sql_query, new StudentRowMapper() , rollno);
		   
		   System.out.println("Roll no :-"+std.getRoll_no());
		   System.out.println("Name :-"+std.getName());
		   System.out.println("Marks :-"+std.getMarks());
		 	    
	    
	}
}

package com.tarun.app;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.tarun.resources.SpringConfig;

public class MainDemo {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		NamedParameterJdbcTemplate npJdbcTemplate = (NamedParameterJdbcTemplate) context
				.getBean(NamedParameterJdbcTemplate.class);

		// String insert_sql_query = "INSERT INTO student VALUES (? ,? ,?)";

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("key_rollno", 104);
		map.put("key_name", "Rajat");
		map.put("key_marks", 80.0f);
		// here we passed named parameter
		// benefit of named parameter user friendly , no confusiion are there
		String insert_sql_query = "INSERT INTO student VALUES (:key_rollno  , :key_name ,   :key_marks)";

		 int n =npJdbcTemplate.update(insert_sql_query, map);
		 if( n > 0)
		 {
			 System.out.println("Insertion succesfully...!");
		 }
		 else
		 {
			 System.out.println("Insertion failed...!");
		 }
	}
}

package com.tarun.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tarun.beans.Student;

public class StudentRowMapper implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		Student std =   new Student();
		std.setRoll_no(rs.getInt("std_roll"));//here u checked all db column name
		std.setName(rs.getString("std_name"));
		std.setMarks(rs.getFloat("std_marks"));
		
		return std;
	}

}

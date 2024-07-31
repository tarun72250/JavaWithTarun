package com.tarun.test;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.tarun.entity.A_02_Employee;
import com.tarun.entity.A_02_Person;
import com.tarun.entity.A_02_Student;

public class A_02_SingleTableInheritance
{

	public static void main(String[] args) {
		
		
		//create the service 
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		//read the info from hibernate.cfg.xml file
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
		
		//acctually  conn to db
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
		
		//session open
		Session session =  sf.openSession();
	
		A_02_Person p = new A_02_Person();
		p.setName("Arpit");
		p.setGender("Male");
		
		
		A_02_Employee e = new A_02_Employee();
		e.setBonus(new BigDecimal("800.78"));
		e.setDeptName("CS");
		e.setDoj(LocalDate.of(2024, 07, 06));
		e.setEmail("rajat123@gmail.com");
		e.setName("Rajat");
		e.setSalary(50000.4567);
		e.setGender("Male");

		A_02_Student s = new A_02_Student();
		s.setName("Manas");
		s.setGender("Male");
		s.setFee(20000.450f);
		s.setSchoolName("DPS");
		s.setSectionName("10thD");
		
	    Transaction tr =  session.beginTransaction();
	     
		session.save(p);
		session.save(e);
		session.save(s);
		
		tr.commit();
		
		System.out.println("All Person , Student and Employee object is saved.");
		
		session.close();
		sf.close();
		
		
	}
}

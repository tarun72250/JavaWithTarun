package com.tarun.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.tarun.entity.A_01_Address;
import com.tarun.entity.A_01_Student;

public class A_01_StudentDemoAssociation 
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
		
		A_01_Address ad = new A_01_Address("Bajrang Nagar","Indore","410026");
		A_01_Student st = new A_01_Student(101,"Nitesh",ad);
		
		Transaction tr =  session.beginTransaction();
		session.save(st);
		tr.commit();
		
		System.out.println(st.getName()+" Info saved in Database");
		
		
		session.close();
		sf.close();
	}
}

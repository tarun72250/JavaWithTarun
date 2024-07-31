package com.tarun.test;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.tarun.entity.A_03_ContractEmp_Single_Table_Inheritance;
import com.tarun.entity.A_03_Emp_Single_Table_Inheritance;
import com.tarun.entity.A_03_SalariedEMp_Single_table_Inheritance;

public class A_03_InheritanceSaveDemo {

	public static void main(String[] args) {
		
		
		//create the service 
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		//read the info from hibernate.cfg.xml file
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
		
		//acctually  conn to db
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
		
		//session open
		Session session =  sf.openSession();
	
		A_03_Emp_Single_Table_Inheritance e1 = new A_03_ContractEmp_Single_Table_Inheritance(1,"Ashok",6.0f,800.0f);
		
		A_03_Emp_Single_Table_Inheritance e2 = new A_03_SalariedEMp_Single_table_Inheritance(2,"Rajat",60000.0f,8000.0f);
		
		
		Transaction tr = session.beginTransaction();
		
		session.save(e1);
		session.save(e2);
		
		tr.commit();
		
		System.out.println("Emps saved");
		
		session.close();
		
		sf.close();
		
		
		
		
	}
}

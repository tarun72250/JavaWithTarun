package com.example.test;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SessionFactory.*;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.example.entity.Product;

public class SaveObjectTest {
	public static void main(String[] args) {

		// 1 way

		/*SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Product.class).buildSessionFactory();
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();

		// Create Object of class Product
		Product p = new Product();
		p.setPid(15);
		p.setPname("SOnal");
		p.setPrice(40000);
		p.setQty(2);
		s.save(p);
		// session me level 1 caache me data store krta h or hibernate ko deta h jis se
		// db me entity save ho jati hai
		System.out.println("Object is saved...!"); // withoutobject of tr we did not save the object in db
		tr.commit(); // object is used to persist the transaction , roolback
*/
		
		
		  //2 way //create the service
		  StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		  
		  //read the info hibernate.cfg.xml file 
		  Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
		  
		  //actually conn to database 
		  SessionFactory sf =metadata.getSessionFactoryBuilder().build();
		  
		  //open the session 
		  Session session = sf.openSession();
		  
		  //Create instance of entity 
		  Product p = new Product(); p.setPid(16);
		  p.setPname("Vishal Vishwakarma"); 
		  p.setPrice(60000.0f);
		  p.setQty(6);
		  
		  //start a transaction 
		  Transaction tr =session.beginTransaction();
		  
		  //save the instance with hibernate 
		  session.save(p);
		  
		  //save the instance of hibernate //this line is most imp without these u can't seen changes in db 
		  tr.commit();
		 
		 System.out.println("Object Saved"); 
		 session.close();
		 
		 sf.close();
		 

	}
}

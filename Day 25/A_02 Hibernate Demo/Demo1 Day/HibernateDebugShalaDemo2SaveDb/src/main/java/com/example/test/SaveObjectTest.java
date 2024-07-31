package com.example.test;


import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SessionFactory.*;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.example.entity.Product;


public class SaveObjectTest 
{
	public static void main(String[] args) {
		

		/*SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Product.class).buildSessionFactory();
		Session s = sf.openSession();
		Transaction tr =s .beginTransaction();
		Product p = new Product();
		p.setPid(14);
		p.setPname("Nitesh");
		p.setPrice(30000);
		p.setQty(4);
		s.save(p);//session me level 1 caache me data store krta h or hibernate ko deta h jis se db me entity save ho jati hai 
		System.out.println("Object is saved...!");
		//without object of tr we did not save the object in db
		tr.commit();	//object is used to persist the transaction , roolback 
		*/
		//create the service
				org.hibernate.boot.registry.StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
						
				//read the info hibernate.cfg.xml file
				Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
						
				//actually conn to database
				SessionFactory sf = metadata.getSessionFactoryBuilder().build();
				
				//open the session
				Session session = sf.openSession();
				
				//Create instance of entity
				Product p = new Product();
				p.setPid(14);
				p.setPname("rahul Vishwakarma");
				p.setPrice(30000.0f);
				p.setQty(4);
				
				//start a transaction
				Transaction tr =session.beginTransaction();
				
				//save the instance with hibernate
				session.save(p);
				
				//save the instance of hibernate
				//this line is most imp without these u can't  seen changes in db
				tr.commit();
						
				System.out.println("Object Saved");
				session.close();
				
				sf.close();
				

	}
}

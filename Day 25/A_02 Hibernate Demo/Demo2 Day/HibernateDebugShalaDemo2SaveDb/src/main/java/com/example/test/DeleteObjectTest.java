package com.example.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.example.entity.Product;

public class DeleteObjectTest {

	public static void main(String[] args) 
	{
		//create the service
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
						
		//read the info hibernate.cfg.xml file
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
						
		//actually conn to database
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
				
		//open the session
		Session session = sf.openSession();
		
		Product p = session.get(Product.class, 14);
		
		if(p != null)
		{
			Transaction tr = session.beginTransaction();
			session.delete(p);
			tr.commit();
			System.out.println("Product deleted");			
		}
		
		session.close();
		sf.close();

	}

}

package com.example.test;

import java.util.List;

import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.example.entity.Product;

public class HQLQueryTest 
{

	public static void main(String[] args) {
		// create the service
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();

		// read the info hibernate.cfg.xml file
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();

		// actually conn to database
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();

		// open the session
		Session session = sf.openSession();

		/*
		 * //HQL - class , property //Select * from Product 
		 * Query q =
		 * session.createQuery("from Product");
		 * 
		 * List<Product> products = q.getResultList();
		 * 
		 * for(Product p : products)
		 * System.out.println(p.getPid()+" : "+p.getPname()+" : "+p.getPrice());
		 */

		/*
		 * //SQL QUERY :- Select some column 
		 * query org.hibernate.Query<Object[]> q =
		 * session.createQuery("select pid,pname from Product where qty = 5",
		 * Object[].class);
		 * 
		 * List<Object[]> products = q.getResultList();
		 * 
		 * for(Object[] product : products) System.out.println(product[0]+
		 * " : "+product[1]);
		 */

		// HQL QUERY :- with parameter or placeholder
		// like DML QUERYs
		// 1 way.
		Query q = session.createQuery("select pid,pname from Product where price > :min and price < :max");
		// HQL QUERY WITH PARAMETER

		// else we do these
		// 2 way
		// Query q = session.createNamedQuery("getByPrice");

		q.setParameter("min", 10000.0f);
		q.setParameter("max", 30000.0f);

		List<Object[]> products = q.getResultList();

		for (Object[] product : products)
			System.out.println(product[0] + " : " + product[1]);

	}

}

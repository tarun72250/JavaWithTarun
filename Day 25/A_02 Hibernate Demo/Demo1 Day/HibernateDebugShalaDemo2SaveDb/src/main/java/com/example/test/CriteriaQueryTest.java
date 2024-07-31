package com.example.test;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.example.entity.Product;

public class CriteriaQueryTest {

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
				
				/*
				//create - select * from emp / from Emp
				
				//1.create criteriabuilder instance
				CriteriaBuilder cb = session.getCriteriaBuilder();
				
				//2.create criteriaquery instance
				CriteriaQuery<Product> cquery = cb.createQuery(Product.class);
				
				//3.specify the root(table from which the records)
				Root<Product> root = cquery.from(Product.class);
				
				//4 specify the properties to be selected
				cquery.select(root);
						
				//5. prepare the query from the criteria
				Query q = session.createQuery(cquery);
				
				//6. get the result(list) from the query
				List<Product> products = q.getResultList();
				
				for(Product p : products)
					System.out.println(p.getPid()+" : "+p.getPname());
				*/
				
				//select empid,ename from EMP
				//1.create criteriabuilder instance
				CriteriaBuilder cb = session.getCriteriaBuilder();
						
				//2.create criteriaquery instance
				CriteriaQuery<Object[]> cquery = cb.createQuery(Object[].class);
						
				//3.specify the root(table from which the records)
				Root<Product> root = cquery.from(Product.class);
						
				//4 specify the properties to be selected
				cquery.multiselect(root.get("pid"),root.get("pname"));
								
				//5. prepare the query from the criteria
				Query q = session.createQuery(cquery);
						
				//6. get the result(list) from the query
				List<Object[]> products = q.getResultList();
						
				for(Object[] p : products)
					System.out.println(p[0]+" : "+p[1]);
				
				
				session.close();
				
				sf.close();

	}

}

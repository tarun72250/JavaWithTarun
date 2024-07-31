package com.tarun.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.tarun.entity.A_04_Order;
import com.tarun.entity.A_04_OrderItems;

public class A_04_SaveMasterChildOrderItemsSave {

	public static void main(String[] args) {

		// create the service
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();

		// read the info from hibernate.cfg.xml file
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();

		// acctually conn to db
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();

		// session open
		Session session = sf.openSession();

		// Master is saved
		/*
		 * A_04_Order o1 = new A_04_Order("hitanshi");
		 * 
		 * Transaction tr = session.beginTransaction();
		 * 
		 * session.save(o1);
		 * 
		 * tr.commit();
		 */

		// child is save as an new master along with its childern
		A_04_OrderItems oi1 = new A_04_OrderItems(2, 1);
		A_04_OrderItems oi2 = new A_04_OrderItems(3, 3);
		A_04_OrderItems oi3 = new A_04_OrderItems(8, 1);
		A_04_OrderItems oi4 = new A_04_OrderItems(3, 3);

		Set<A_04_OrderItems> items = new HashSet();
		items.add(oi1);
		items.add(oi2);
		items.add(oi3);
		items.add(oi4);

		A_04_Order o3 = new A_04_Order("Rajat");
		o3.setOrderitems(items);

		Transaction tr = session.beginTransaction();

		session.save(o3);

		tr.commit();

		session.close();
		sf.close();

	}

}

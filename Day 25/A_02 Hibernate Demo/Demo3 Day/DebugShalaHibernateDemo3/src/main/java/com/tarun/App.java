package com.tarun;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project Started...!" );
        //1.
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        //2
        SessionFactory factory =  cfg.buildSessionFactory();
        
        Address ad = new Address();
        ad.setStreet("Street2");
        ad.setCity("Bhopal");
        ad.setOpen(true);
        ad.setX(211134.576);
        ad.setAddedDate(new Date());
        
        FileInputStream f = new FileInputStream("src/main/java/1.jpg");
        
        byte [ ]data = new byte[f.available()];
        //give size of f.available() array 
        
        f.read(data);
        
        ad.setImage(data);
        
        //3
         Session session = factory.openSession();
         
         Transaction tr = session.beginTransaction();
         
         session.save(ad);
         
         tr.commit();
         System.out.println("Object saved");
         
         session.close();
         factory.close();
        
        
    }
}

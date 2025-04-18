package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.entity.Employee;
import com.entity.Mobile;

public class DeleteMobileData {

	public static void main(String[] args) {
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		
		Transaction tr = ss.beginTransaction();
		
		int emp_id = 1;
		
		Mobile e1 = ss.get(Mobile.class,emp_id);
		
		//ss.delete(e1); 
		
		ss.remove(e1);
		
		System.out.println("deleted........");
		
		
		tr.commit();
		
		ss.close();
		
	}

}

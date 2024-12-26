package com.dhineshDeveloper;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//DAO impl
public class hiberanateManager {
	static Session s;
	static Transaction t;
	void connect() {
		Configuration config1 = new Configuration();
	//if the file name same as hibernate.cfg.xml no need to mention , ortherwise mention in configure method.
		//Configuration config2 = config1.configure("hibernate.cfg.xml");
		Configuration config2 = config1.configure();
		SessionFactory sf = config2.buildSessionFactory();
		 s = sf.openSession();
//		Transaction t = s.beginTransaction();
	}

	public void add(EmployeeEntity e) {
		Transaction t = s.beginTransaction();
		s.persist(e);
		t.commit();
		System.out.println("Data added.");
	}
}

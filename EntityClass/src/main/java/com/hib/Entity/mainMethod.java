package com.hib.Entity;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class mainMethod {

	public static void main(String[] args) {
		Session session = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(student.class).
				addAnnotatedClass(studentDetails.class).
				buildSessionFactory().openSession();
		
		/*updating the data
		 * student s = session.get(student.class,108);
		s.getSd().setEdArea("BTM Layout");
		
		session.beginTransaction();
		session.persist(s);
		session.getTransaction().commit();
		 */
		
	/*// Fetching details
		 * 
		 * student s = session.get(student.class,108);
		System.out.println("ID: "+s.getE_id());
		System.out.println("Name: "+s.getE_name());
		System.out.println("Dept: "+s.getDept());
		System.out.println("Email: "+s.getEmail());
		System.out.println("Salary: "+s.getSalary());
		System.out.println("EdId: "+s.getSd().getEdId());
		System.out.println("EdArea: "+s.getSd().getEdArea());
		System.out.println("EdCity: "+s.getSd().getEdCity());
		System.out.println("EdPincode: "+s.getSd().getEdPincode());
		 */
		
		
		/*// inserting the details.
		 * student c1 = new student(109,"virat","virat@gmail.com","cricketer",60000);
		studentDetails sd = new studentDetails("BTM","Bangalore",560076);
		c1.setSd(sd);
		
		Transaction t = session.beginTransaction();
		session.persist(sd);
		session.getTransaction().commit();
		
		 */
		System.out.println("Data Inserted");
	}

}

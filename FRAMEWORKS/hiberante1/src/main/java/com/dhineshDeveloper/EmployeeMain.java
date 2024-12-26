package com.dhineshDeveloper;

import org.hibernate.Transaction;

public class EmployeeMain {

	public static void main(String[] args) {
		hiberanateManager hm = new hiberanateManager();
		hm.connect();

		
		EmployeeEntity e = new EmployeeEntity("bob","manager"
				,60000,"bob@gmail.com","bob123");
		hm.add(e);
	}

}

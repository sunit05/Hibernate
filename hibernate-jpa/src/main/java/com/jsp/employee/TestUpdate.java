package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdate {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("sunit"); //create a connection
		
		EntityManager entityManager= 
				entityManagerFactory.createEntityManager();  // database
		
		EntityTransaction entityTransaction=
				entityManager.getTransaction();
		
		Employee employee =entityManager.find(Employee.class,3);
		
		employee.setEmail("abc@mail.com");
		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
		
	}
}
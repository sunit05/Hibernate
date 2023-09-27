package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sunit"); // create a
																										// connection
		EntityManager entityManager = entityManagerFactory.createEntityManager(); // handle database operations

		EntityTransaction entityTransaction = entityManager.getTransaction(); // handles actions

		Employee employee = new Employee();
//			employee.setId(2);
		employee.setName("d");
		employee.setEmail("d@gmail.com");
		employee.setCno(123456);

		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}
}

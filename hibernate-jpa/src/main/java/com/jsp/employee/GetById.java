package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetById {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=
				Persistence.createEntityManagerFactory("sunit");
		
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		
		Employee employee= entityManager.find(Employee.class,2);
		
		
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		
	}
}
package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import java.util.List;

import javax.persistence.*;


public class TestGetAll {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=
				Persistence.createEntityManagerFactory("sunit");
		
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		
		Employee employee= entityManager.find(Employee.class,2);
		
		String sql="SELECT e FROM Employee e";
		
		Query query = entityManager.createQuery(sql);
		
		List<Employee> employees = query.getResultList();
		for(Employee e: employees) {
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getCno());
			System.out.println(e.getEmail());
			System.out.println("--------------------");
		}
	}
}

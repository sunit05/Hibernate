package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Driver {
	
	public static void main(String[] args) {
		
	EntityManagerFactory entityManagerFactory=
			Persistence.createEntityManagerFactory("sunit");
	
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction = entityManager.getTransaction(); 

	//create person object
	
	Person person=new Person();
	person.setName("sunit");
	person.setMail("sunit@mail.com");

	Pan pan=new Pan();
	pan.setAddress("mumbai");
	
	//setting pan with specified person
	pan.setPerson(person);
	person.setPan(pan);
	
	entityTransaction.begin();
	entityManager.persist(pan);
	entityManager.persist(person);
	entityTransaction.commit();
	
	}
}
	

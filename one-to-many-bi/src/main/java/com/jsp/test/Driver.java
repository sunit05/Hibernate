package com.jsp.test;

import java.util.ArrayList;
import java.util.List;

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
	
	Bank bank= new Bank();
	
	bank.setBank_name("AXIS");
	
	Branches b1=new Branches();
	b1.setBranch_name("vashi");
	
	Branches b2=new Branches();
	b2.setBranch_name("nerul");
	
	Branches b3=new Branches();
	b3.setBranch_name("panvel");
	
	List<Branches> branchesList = new ArrayList<Branches>();

	branchesList.add(b1);
	branchesList.add(b2);
	branchesList.add(b3);
	
	b1.setBank(bank);
	b2.setBank(bank);
	b3.setBank(bank);
	
	entityTransaction.begin();
	entityManager.persist(bank);
	entityManager.persist(b1);
	entityManager.persist(b2);
	entityManager.persist(b3);
	entityTransaction.commit();
	
}
}

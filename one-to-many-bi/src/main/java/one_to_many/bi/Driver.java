package one_to_many.bi;

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
		
		Person person=new Person();
		person.setName("sunit");
		
		BankAccount bankAccount1 =new BankAccount();
		bankAccount1.setBank_name("HDFC");
	
		BankAccount bankAccount2=new BankAccount();
		bankAccount2.setBank_name("ICICI");
		
		List<BankAccount> accounts= new ArrayList<BankAccount>();
		accounts.add(bankAccount1);
		accounts.add(bankAccount2);
		
		bankAccount1.setPerson(person);
		bankAccount2.setPerson(person);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
	}
}

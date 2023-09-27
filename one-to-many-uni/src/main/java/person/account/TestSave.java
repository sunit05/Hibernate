package person.account;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {
	public static void main(String[] args) {
		
	EntityManagerFactory entityManagerFactory=
			Persistence.createEntityManagerFactory("sunit");
	
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction = entityManager.getTransaction(); 

	Account account1=new Account();
	account1.setAcc_no(12345667);
	account1.setBank_name("AXIS");
	account1.setIsfc_code("A12344");
	
	Account account2=new Account();
	account2.setAcc_no(12345667);
	account2.setBank_name("SBI");
	account2.setIsfc_code("SBI12344");
	
	Account account3=new Account();
	account3.setAcc_no(12345667);
	account3.setBank_name("BOI");
	account3.setIsfc_code("BOI12344");

	Person person= new Person();
	person.setName("sunit");
	person.setC_no(123344);
	person.setGender("male");
	
	ArrayList<Account> accounts= new ArrayList<Account>();
	accounts.add(account3);
	accounts.add(account2);
	accounts.add(account1);
	
	person.setAccounts(accounts);
	
	entityTransaction.begin();
	entityManager.persist(person);
	entityManager.persist(account1);
	entityManager.persist(account2);
	entityManager.persist(account3);
	entityTransaction.commit();
	
	
}
}
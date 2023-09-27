package many_to_many_bi;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver1 {
public static void main(String[] args) {
	

	EntityManagerFactory entityManagerFactory=
			Persistence.createEntityManagerFactory("sunit");
	
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction = entityManager.getTransaction();

	
	Student1 student1=new Student1();
	student1.setName("x");
	student1.setMail("x@mail.com");

	Student1 student2=new Student1();
	student2.setName("y");
	student2.setMail("y@mail.com");
	
	Course1 course1= new Course1();
	course1.setC_name("java");
	
	Course1 course2=new Course1();
	course2.setC_name("sql");
	
	ArrayList<Course1>course1s= new ArrayList<Course1>();
	course1s.add(course1);
	course1s.add(course2);
	
	ArrayList<Student1> student1s= new ArrayList<Student1>();
	student1s.add(student1);
	student1s.add(student2);
	
	student1.setCourse1s(course1s);
	student2.setCourse1s(course1s);
	
	course1.setStudent1s(student1s);
	course2.setStudent1s(student1s);
	
	entityTransaction.begin();
	entityManager.persist(student1);
	entityManager.persist(student2);
	entityManager.persist(course1);
	entityManager.persist(course2);
	entityTransaction.commit();
	
}
}

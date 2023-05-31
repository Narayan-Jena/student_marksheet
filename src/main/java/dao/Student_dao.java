package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Student_dto;

public class Student_dao {
   EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
   EntityManager manager=factory.createEntityManager();
   EntityTransaction transaction=manager.getTransaction();
   
   public void student_data(Student_dto dto) {
	transaction.begin();
	manager.persist(dto);
	transaction.commit();
}
   public Student_dto student_marksheet(int id) {
	Student_dto result=manager.find(Student_dto.class, id);
	return result;
}
   public void student_remove(int roll_no) {
   Student_dto result=manager.find(Student_dto.class, roll_no);{
      transaction.begin();
	  manager.remove(result);
	  transaction.commit();
   }
   }
}

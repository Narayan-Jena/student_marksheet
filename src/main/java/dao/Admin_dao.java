package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Admin_dto;

public class Admin_dao {

	EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	public void Admin_Acc(Admin_dto admin_dto) {
		transaction.begin();
		manager.persist(admin_dto);
		transaction.commit();	
	}
	public Admin_dto Admin_login(String id) {
		Admin_dto res=manager.find(Admin_dto.class, id);
		return res;
	}
}

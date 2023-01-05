package com.jsp.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarDriver {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sonam");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Car car = new Car();
		
		//car.setId(1);
		car.setName("Ford");
		car.setBrand("Endeavour");
		
		entityTransaction.begin();
		entityManager.persist(car);
		entityTransaction.commit();
		System.out.println("All Good");
	}

}

package com.jsp.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarModify {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sonam");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Car car = entityManager.find(Car.class, 2);
		
		car.setBrand("X5");
		
		if(car != null) {
			entityTransaction.begin();
			entityManager.merge(car);
			entityTransaction.commit();
			System.out.println("Value Updated");
			
			
		}
		else {
			System.out.println("Value not Updated");
		}
		
		
	}

}

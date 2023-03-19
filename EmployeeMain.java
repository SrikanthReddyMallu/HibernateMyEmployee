package com.emp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class EmployeeMain 
{
public static void main(String[] args) 
{
	EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	Employee employee =new Employee();
	employee.setName("guru");
	employee.setAge(25);
	employee.setGender("male");
	employee.setSal(2500);
	employee.setPhno(75283357l);
	
	entityTransaction.begin();
	entityManager.persist(employee);
	entityTransaction.commit();	
}
}

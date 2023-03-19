package com.emp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class GetEmployeeDetails 
{
public static void main(String[] args) 
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	Query query=entityManager.createQuery("select s from Employee s where s.sal>?1 and s.age>?2");
   // query.setParameter(1,3000.0);
    query.setParameter(2,23);
    List<Employee> employees=query.getResultList();
    for(Employee employee : employees)
    {
    	System.out.println("The employee id is="+employee.getId());
    	System.out.println("The employee id is="+employee.getName());
    	System.out.println("The employee id is="+employee.getAge());
    	System.out.println("The employee id is="+employee.getGender());
    	System.out.println("The employee id is="+employee.getPhno());
    	
    }
    
    
}
}

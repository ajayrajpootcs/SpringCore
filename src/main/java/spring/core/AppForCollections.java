package spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.model.EmployeeForCollections;

public class AppForCollections {
	public static void main(String[] args) {
		ApplicationContext IOC = new ClassPathXmlApplicationContext("AppContextForCollections.xml");
		//Using Constructors
		EmployeeForCollections e = (EmployeeForCollections)IOC.getBean("list");
		System.out.println(e);
		EmployeeForCollections e2 = (EmployeeForCollections)IOC.getBean("Map");
		System.out.println(e2);
		EmployeeForCollections e3 = (EmployeeForCollections)IOC.getBean("Set");
		System.out.println(e3);
		//Using Setters & Getters
		EmployeeForCollections e4 = (EmployeeForCollections)IOC.getBean("List2");
		System.err.println(e4);
		EmployeeForCollections e5 = (EmployeeForCollections)IOC.getBean("Map2");
		System.err.println(e5);
		EmployeeForCollections e6 = (EmployeeForCollections)IOC.getBean("Set2");
		System.err.println(e6);
		
	}

}

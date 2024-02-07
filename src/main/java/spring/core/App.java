package spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.model.Address;
import spring.model.Employee;
import spring.model.EmployeeForLookup;

public class App {
	public static void main(String[] args){
		ApplicationContext IOC = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//		Employee e = (Employee)IOC.getBean(Employee.class);
//		System.out.println(e);
//		
		EmployeeForLookup e1 = (EmployeeForLookup)IOC.getBean("emp");
		e1.setAddress(e1.applyMethod());
		
		Address a = e1.applyMethod();
		Address b = e1.applyMethod();
		
		System.out.println(a.hashCode());
    	System.out.println(b.hashCode());
    	
    	System.out.println(e1);
    	e1.getAddress().setCity("CITY");
    	System.out.println(e1);
    	
    	EmployeeForLookup e2 = (EmployeeForLookup)IOC.getBean("emp");
		e2.setAddress(e1.applyMethod());
		e2.getAddress().setCity("CITY@");
		System.out.println(e2);
	}

	
}

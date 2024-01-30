package spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.model.DbSingleton;
import spring.model.Employee;

public class App {
	public static void main(String[] args) throws Exception {
		ApplicationContext IOC = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//		Employee e =IOC.getBean(Employee.class,"Kunal");
		Employee e2 = (Employee)IOC.getBean("child");
//		Employee e2 = IOC.getBean(Employee.class);
//		System.out.println(e);
		System.out.println(e2);
		
//		Bean LifeCycle
//		Employee e3 = (Employee)IOC.getBean("emp2");
//		System.err.println(e3);
		
		//Inner Bean
//		Employee e4 = (Employee)IOC.getBean("emp3");
//		System.err.println(e4);
//		e4.getAddress().setCity("BLY");
//		System.err.println(e4);
//		
//		Employee e5 = (Employee)IOC.getBean("emp3");
//		System.err.println(e5);
//		e4.getAddress().setCity("GZB");
//		System.err.println(e4);
//		
		
		//Factory Method to get Single bean OBJ
//		DbSingleton e6 = (DbSingleton)IOC.getBean("singleton");
//		System.err.println(e6);
//		DbSingleton e7 = (DbSingleton)IOC.getBean("singleton");
//		System.err.println(e7);
		
		
		
	}

}

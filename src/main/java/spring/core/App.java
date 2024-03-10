package spring.core;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.model.Employee;
import spring.repo.EmployeeDao;

public class App {
	public static void main(String[] args) {
		ApplicationContext IOC = new ClassPathXmlApplicationContext("Application.xml");
		EmployeeDao db = IOC.getBean("edao",EmployeeDao.class);
		Employee e = new Employee(101,"Rocky",10000);
//		db.saveEmployee(e);s
		db.saveByPrepaired(e);
		System.out.println("Saved....");
		
	}

}

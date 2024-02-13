package spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.config.AppConfig;
import spring.model.Employee;

public class App {
	public static void main(String[] args) {
//		ApplicationContext IOC = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		ApplicationContext IOC = new AnnotationConfigApplicationContext(AppConfig.class);
		 Employee e = (Employee)IOC.getBean(Employee.class);
		 System.out.println(e);
//		Employee bean = IOC.getBean("employee", Employee.class);
//		System.out.println(bean);

	}

}

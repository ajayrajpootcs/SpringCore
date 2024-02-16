package spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import spring.config.AppConfig;
import spring.model.Address;
import spring.model.Employee;

public class App {
	public static void main(String[] args) {
//		ApplicationContext IOC = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		ApplicationContext IOC = new AnnotationConfigApplicationContext(AppConfig.class);
		//Get Employee Bean
		 Employee e = (Employee)IOC.getBean(Employee.class);
		 System.out.println(e);
//		Employee bean = IOC.getBean("employee", Employee.class);
//		System.out.println(bean);
		 
		 //Different Bean Beacause of prototype scope
		 Address address = IOC.getBean(Address.class);
		 Address address2 = IOC.getBean(Address.class);
		 System.out.println(address);
		 System.out.println(address2);
		 
		 //Closing IOC
		 ((AbstractApplicationContext)IOC).registerShutdownHook();
	}

}

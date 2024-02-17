package spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.config.AppConfig;
import spring.config.AppConfigForValue;
import spring.model.EmployeeForValue;

public class AppForValue {
	public static void main(String[] args) {
		ApplicationContext IOC = new AnnotationConfigApplicationContext(AppConfigForValue.class);
		EmployeeForValue emp = IOC.getBean(EmployeeForValue.class);
		System.out.println(emp);
	}

}

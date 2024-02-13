package spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.model.Employee;
import spring.model.EmployeeForInterFace;

public class App {
	public static void main(String[] args) {
		ApplicationContext IOC = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//		 Employee e = (Employee)IOC.getBean(Employee.class);
//		 System.out.println(e);
//		Employee bean = IOC.getBean("employee", Employee.class);
//		System.out.println(bean);

		//For Qualifier And Primary
		 EmployeeForInterFace e = (EmployeeForInterFace)IOC.getBean(EmployeeForInterFace.class);
		 System.out.println(e);
		
	}

}

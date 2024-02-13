package spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.model.Address;
import spring.model.Employee;

@Configuration
@ComponentScan(basePackages = "spring.model")
public class AppConfig {
	
	@Bean
//	@Scope()
	public Address getAddress() {
		return new Address();
	}

	@Bean
	public Employee getEmployee() {
		return new Employee();
	}
	
	

}

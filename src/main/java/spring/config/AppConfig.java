package spring.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
//import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import spring.model.Address;
import spring.model.Employee;

@Configuration
@ComponentScan(basePackages = "spring.model")
public class AppConfig {
	
//	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	@Bean(initMethod="turnOn", destroyMethod="turnOff")
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Address getAddress() {
		return new Address();
	}

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	@Lazy
	public Employee getEmployee() {
		return new Employee();
	}
	
	

}

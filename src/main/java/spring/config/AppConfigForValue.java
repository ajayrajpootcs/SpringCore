package spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "spring.model")
@PropertySource("classpath:ValueAnnonations.properties")
public class AppConfigForValue {

}

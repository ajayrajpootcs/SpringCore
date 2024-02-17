package spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmployeeForValue {
	private int id=101;
	private String name="Ajay";
	@Autowired
	private AddressForValue address;
	
//	@Value("#{address.companyName}")
//	private String companyName;
	
	public EmployeeForValue() {
		super();
	}

	@Override
	public String toString() {
		return "EmployeeForValue [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

//	@Override
//	public String toString() {
//		return "EmployeeForValue [id=" + id + ", name=" + name + ", address=" + address + ", companyName=" + companyName
//				+ "]";
//	}
//	

	
	
	
	

}

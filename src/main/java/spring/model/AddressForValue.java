package spring.model;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AddressForValue {
	private String companyName = "TEAMAR";
	@Value("${common.street}")
	private String street;
	@Value("${common.city}")
	private String city;
	@Value("${common.state}")
	private String state;
	
	
	@Value("${COMPUTERNAME}") //Check from Computer Environment
	private String path;
	
	@Value("${listOfValues}")
	private String Array[];

	@Value("#{${valuesMap}}")
	private Map<String, Integer> MAP;

	public AddressForValue() {
		super();

	}
	
	
//	public String getCompanyName() {
//		return companyName;
//	}

	@Override
	public String toString() {
		return "AddressForValue [CompanyName="+companyName +", street=" + street + ", city=" + city + ", state=" + state+ ", path=" + path + ", Array=" + Arrays.toString(Array) + ", MAP=" + MAP + "]";
	}

	

}

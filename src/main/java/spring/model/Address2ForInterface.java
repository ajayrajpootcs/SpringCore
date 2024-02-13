package spring.model;

import org.springframework.stereotype.Component;

@Component
public class Address2ForInterface implements InterfaceForAddress {
	private String street="mamura2";
	private String city="Noida2";
	private String state="UP";
	@Override
	public String getStreet() {
		return street;
	}
	@Override
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String getCity() {
		return city;
	}
	@Override
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String getState() {
		return state;
	}
	@Override
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address2ForInterface [street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	
	

}

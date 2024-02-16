package spring.model;

//import org.springframework.stereotype.Component;

//@Component(value="address") // defined in JavaConfig don't need hare
public class Address {
	private String street="mamura";
	private String city="Noida";
	private String state="UP";

	public Address(String street, String city, String state) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
	}

	public Address() {
		super();

	}
	public void turnOn() {
		System.out.println("Load operating system for address");
	}

	public void turnOff() {
		System.out.println("Close all programs for address");
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

//	@Override
//	public String toString() {
//		return "Address [street=" + street + ", city=" + city + ", state=" + state + "]";
//	}

}

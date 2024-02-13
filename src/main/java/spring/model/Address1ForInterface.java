package spring.model;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary //InCase Of Two Same Beans
public class Address1ForInterface implements InterfaceForAddress {
	private String street="mamura";
	private String city="Noida";
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
		return "Address1ForInterface [street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	
	

}

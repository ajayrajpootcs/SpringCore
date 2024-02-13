package spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmployeeForInterFace {
	private int id=14;
	private String name="Sam Bahadur";
	@Autowired
	@Qualifier("address2ForInterface") //InCase Of Two Same Beans
	private InterfaceForAddress address;
	
	
	public EmployeeForInterFace() {
		super();
	}
	public EmployeeForInterFace(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("usingConstructor/");
	}
//	@Autowired // Can't Autowire With Constructor
	public EmployeeForInterFace(int id, String name,InterfaceForAddress address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		System.out.println("usingConstructor/");
	}
	
	public InterfaceForAddress getAddress() {
		return address;
	}
//	@Autowired
	public void setAddress(InterfaceForAddress address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		System.out.println("SettingID.....");
	}
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("settingName.....");
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	

}

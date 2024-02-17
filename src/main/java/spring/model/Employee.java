package spring.model;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.config.ConfigurableBeanFactory;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;

//@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Employee {
	private int id;
	private String name;
	private int Salary;
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}

	@Autowired
	private Address address;
	
	public Employee() {
		super();
	}
	public Employee(int id, String name,int salary) {
		super();
		this.id = id;
		this.name = name;
		this.Salary= salary;
		System.out.println("usingConstructor/");
	}
//	@Autowired // Can't Autowire With Constructor
	public Employee(int id, String name,Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		System.out.println("usingConstructor/");
	}
	
	public Address getAddress() {
		return address;
	}
//	@Autowired
	public void setAddress(Address address) {
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

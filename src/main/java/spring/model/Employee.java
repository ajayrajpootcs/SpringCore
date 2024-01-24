package spring.model;

import lombok.Data;

//@Data
public class Employee {
	private int id;
	private String name;
	public Employee() {
		super();
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("usingConstructor/");
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
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	

}

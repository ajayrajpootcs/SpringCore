package spring.model;

public abstract class EmployeeForLookup {
	private int id;
	private String name;
	
	private Address address;
	
	public EmployeeForLookup() {
		super();
	}
	public abstract Address applyMethod();
	public EmployeeForLookup(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("usingConstructor/");
	}
	public EmployeeForLookup(int id, String name,Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		System.out.println("usingConstructor/");
	}
	
	public Address getAddress() {
		return address;
	}
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


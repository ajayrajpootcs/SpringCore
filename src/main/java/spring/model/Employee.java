package spring.model;

//import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.factory.InitializingBean;

//import lombok.Data;

//@Data
//implements InitializingBean , DisposableBean // for BeanLifeCycle
public class Employee {
	private int id;
	private String name;
	
	private Address address;
	
	public Employee() {
		super();
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("usingConstructor/");
	}
	public Employee(int id, String name,Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		System.out.println("usingConstructor/");
	}
	
	//INIT METHOD while bean Destroying
//	private void xmlInitMethod() {
//		System.out.println("XML INIT METHOD....");
//	}
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println(" afterPropertiesSet() METHOD of InitializingBean Interface....");
//		
//	}
//	//Destroy Method while Bean Destroy
//	private void xmlDestroyMethod() {
//		System.out.println("XML DESTROY METHOD....");
//	}
//	@Override
//	public void destroy() throws Exception{
//		System.out.println(" destroy() METHOD of DisposableBean Interface....");	
//	}
	
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

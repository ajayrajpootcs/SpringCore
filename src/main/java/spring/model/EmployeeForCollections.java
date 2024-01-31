package spring.model;

import java.util.List;
import java.util.Map;
//import java.util.Set;
import java.util.TreeSet;

public class EmployeeForCollections {
	private int id;
	private String name;
	List<Integer> contacts ;
	Map<Integer,String> stdDetails;
	TreeSet<String> uniqueVal;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Integer> getContacts() {
		return contacts;
	}
	public void setContacts(List<Integer> contacts) {
		this.contacts = contacts;
	}
	public Map<Integer, String> getStdDetails() {
		return stdDetails;
	}
	public void setStdDetails(Map<Integer, String> stdDetails) {
		this.stdDetails = stdDetails;
	}
	public TreeSet<String> getUniqueVal() {
		return uniqueVal;
	}
	public void setUniqueVal(TreeSet<String> uniqueVal) {
		this.uniqueVal = uniqueVal;
	}
	public EmployeeForCollections(int id, String name, List<Integer> contacts) {
		super();
		this.id = id;
		this.name = name;
		this.contacts = contacts;
	}
	
	public EmployeeForCollections(int id, String name, Map<Integer, String> stdDetails) {
		super();
		this.id = id;
		this.name = name;
		this.stdDetails = stdDetails;
	}
	
	public EmployeeForCollections(int id, String name, TreeSet<String> uniqueVal) {
		super();
		this.id = id;
		this.name = name;
		this.uniqueVal = uniqueVal;
	}
	
	public EmployeeForCollections() {
		super();
	}
	@Override
	public String toString() {
		return "EmployeeForCollections [id=" + id + ", name=" + name + ", contacts=" + contacts + ", stdDetails="
				+ stdDetails + ", uniqueVal=" + uniqueVal + "]";
	}
	
	
	
	

}

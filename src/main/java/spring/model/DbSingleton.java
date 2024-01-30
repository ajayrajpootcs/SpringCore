package spring.model;

public class DbSingleton {
	
	private DbSingleton() {}
	
	private static DbSingleton obj = new DbSingleton();
	
	public static DbSingleton getSingleton() {
		return obj;
	}

}

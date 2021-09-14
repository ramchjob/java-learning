package test;

public class Employee {
	
	private String id;
	
	private String name;
	
	private Employee manager;
	

	public Employee(String id, String name, Employee manager) {
		super();
		this.id = id;
		this.name = name;
		this.manager = manager;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}
	
	

}

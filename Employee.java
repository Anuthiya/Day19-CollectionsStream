package trainingday19COLLECTIONSstreams;

public class Employee {
	private int id;
	private int salary;
	private String maritalStatus;
	
	public void setId(int id) {
		this.id=id;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus=maritalStatus;
	}
	public int getId() {
		return id;
	}
	public int getSalary() {
		return salary;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public Employee (int id, int salary, String maritalStatus) {
		this.id=id;
		this.salary=salary;
		this.maritalStatus=maritalStatus;
	}
	public String toString() {
		return id+" "+salary+" "+maritalStatus;
		
	}
	

}

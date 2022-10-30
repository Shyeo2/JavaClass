package kr.co.ezenac.global02;

public class Employee {
	public static int serialNum = 1000;	//스태틱
	private int employeeId;				//인스턴스 
	private String employeename;
	private String department;

	public Employee() {
		Employee.serialNum++;
		employeeId = serialNum;
		
		
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}

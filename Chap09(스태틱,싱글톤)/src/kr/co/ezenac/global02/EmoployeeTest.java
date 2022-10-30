package kr.co.ezenac.global02;

public class EmoployeeTest {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setEmployeename("최선혜");

		Employee employee2 = new Employee();
		employee2.setEmployeename("신사임당");

		System.out.println(employee1.getEmployeename() + "," + employee1.getEmployeeId());
		System.out.println(employee2.getEmployeename() + "," + employee2.getEmployeeId());

		System.out.println(Employee.serialNum);
	}

}

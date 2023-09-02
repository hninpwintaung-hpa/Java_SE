package homework.hashMap;

import java.util.HashMap;

public class EmployeeDepartmentEx7 {
	HashMap<Integer, String> employeeDepartmentMap = new HashMap<>();

	public void addEmployeeDepartment(int employeeID, String department) {
		employeeDepartmentMap.put(employeeID, department);
	}

	public String findEmployeeDepartment(int employeeID) {
		return employeeDepartmentMap.get(employeeID);
	}

	public static void main(String[] args) {
		EmployeeDepartmentEx7 employeeDepartment = new EmployeeDepartmentEx7();

		employeeDepartment.addEmployeeDepartment(101, "HR");
		employeeDepartment.addEmployeeDepartment(102, "Finance");
		employeeDepartment.addEmployeeDepartment(103, "Engineering");
		employeeDepartment.addEmployeeDepartment(104, "Marketing");

		int employeeToFind = 102;
		String department = employeeDepartment.findEmployeeDepartment(employeeToFind);

		System.out.println("Employee " + employeeToFind + " is in the " + department + " department.");

	}
}

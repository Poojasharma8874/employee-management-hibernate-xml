package com.example;

public class Main {
	public static void main(String[] args) {

		EmployeeDAO dao = new EmployeeDAO();

		// Add employees
		Integer empID1 = dao.addEmployee("Zara", "Ali", 1000);
		Integer empID2 = dao.addEmployee("Daisy", "Das", 5000);
		Integer empID3 = dao.addEmployee("Alex", "Paul", 10000);

		// List all employees
		dao.listEmployees();

		// Update salary
		dao.updateEmployee(empID1, 5000);

		// Delete employee
		dao.deleteEmployee(empID2);

		// List again
		dao.listEmployees();
	}
}

package com.pro.emp.service;

import java.util.List;

import com.pro.emp.model.Employee;

public interface EmployeeService {
	public List<Employee>  getAllEmployees();

	Employee getEmployeeById(int eid);

	public void addEmployee(Employee e);
	
	public void updateEmployee(Employee e,int eid);
	
	public void deleteEmployee(int eid);

	public List<Employee> getEmpolyeeByDept(String dept);
	
	
}

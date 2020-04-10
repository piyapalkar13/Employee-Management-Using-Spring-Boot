package com.pro.emp.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pro.emp.model.Employee;
import com.pro.emp.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService es;
	
	@RequestMapping("/welcome")
	public String welcomeEmployee()
	{
		return "Hello Employee..!!!";
		
	}
	
	@RequestMapping("/employees")
	public List<Employee>  getAllEmployees()
	{
		return es.getAllEmployees();
	}
	
	@RequestMapping("/employees/{eid}")
	public Employee getEmpById(@PathVariable int eid)
	{
		return es.getEmployeeById(eid);
		
	}
	
	@RequestMapping(value = "/employees",method = RequestMethod.POST)
	public void addEmployee(@RequestBody Employee e)
	{
		es.addEmployee(e);
	}

	@RequestMapping(value = "/employees/{eid}",method = RequestMethod.PUT)
	public void updateEmployee(@RequestBody Employee e, @PathVariable int eid)
	{
		es.updateEmployee(e, eid);
	}

	@RequestMapping(value = "/employees/{eid}",method = RequestMethod.DELETE)
	public void deleteEmployee(@RequestBody Employee e,@PathVariable int eid)
	{
		es.deleteEmployee(eid);
	}

	@RequestMapping("/employees/dept/{dept}")
	public List<Employee> getEmpolyeeByDept(@PathVariable String dept)
	{
		
		return es.getEmpolyeeByDept(dept);
	}
	



}

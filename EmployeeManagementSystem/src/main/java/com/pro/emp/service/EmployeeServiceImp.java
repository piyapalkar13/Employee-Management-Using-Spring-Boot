package com.pro.emp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.emp.dao.EmpRepository;
import com.pro.emp.model.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {

	List<Employee> elist =new ArrayList<Employee> (Arrays.asList(new Employee(101, "piya", "IT"), new Employee(102, "Anup", "Computer"),
			new Employee(103, "Sagar", "BCS")));

	@Autowired
	private EmpRepository repo;

	@Override
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

	@Override
	public Employee getEmployeeById(int eid) {

		//	elist.stream().filter(e -> e.getEid() == eid).findFirst().get();
		return repo.getOne(eid);
	}

	@Override
	public void addEmployee(Employee e) {
		//elist.add(e);
		repo.save(e);
	}

	@Override
	public void updateEmployee(Employee e, int eid) {
		/*
		for(int i=0;i<elist.size();i++)
		{
			Employee emp=elist.get(i);

			if(emp.getEid()==eid)
			{
				elist.set(i, emp);
			}
		}
		 */

		repo.save(e);
	}

	@Override
	public void deleteEmployee(int eid) {
		//elist.removeIf(e->e.getEid()==eid);
		repo.deleteById(eid);
	}

	@Override
	public List<Employee> getEmpolyeeByDept(String dept) {
		return repo.findByDeptName(dept);
		
		
	}

}

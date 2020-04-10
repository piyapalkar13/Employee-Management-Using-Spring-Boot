package com.pro.emp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pro.emp.dao.ProjectRepository;
import com.pro.emp.model.Employee;
import com.pro.emp.model.Project;

@Service
public class ProjectServiceImp implements ProjectService {

	List<Employee> elist =new ArrayList<Employee> (Arrays.asList(new Employee(101, "piya", "IT"), new Employee(102, "Anup", "Computer"),
			new Employee(103, "Sagar", "BCS")));

	@Autowired
	private ProjectRepository repo;

	@Override
	public List<Project> getAllProjects() {
		
		
		return repo.findAll();
	}

	@Override
	public List<Project> getProjectList(int eid) {
		
		return repo.findByEmpolyeeEid(eid);
	}

	@Override
	public Project getProjectById(int pid) {
		
		
		return repo.getOne(pid);
	}

	@Override
	public void addProject(Project proj) {
		
		repo.save(proj);
		
	}

	@Override
	public void updateProject(Project proj) {
		repo.save(proj);
	}

	@Override
	public void deleteProjectById(int pid) {
		repo.deleteById(pid);
		
	}

}

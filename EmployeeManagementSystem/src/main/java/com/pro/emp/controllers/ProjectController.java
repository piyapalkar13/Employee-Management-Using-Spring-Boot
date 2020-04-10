package com.pro.emp.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.pro.emp.model.Employee;
import com.pro.emp.model.Project;
import com.pro.emp.service.ProjectService;

@RestController
public class ProjectController {

	@Autowired
	private ProjectService es;

	@RequestMapping("/employees/{eid}/projects")
	public List<Project> getAllProjects(@PathVariable int eid) {	
		System.out.println("in project controller");
		List<Project> projList = es.getProjectList(eid);
		System.out.println(projList);
		return projList;
	}

	@RequestMapping("/projects")
	public List<Project> getProjectList()
	{
		return es.getAllProjects();

	}


	@RequestMapping("/employees/{eid}/projects/{pid}")
	public Project getProjectById(@PathVariable int pid)
	{
		return es.getProjectById(pid);

	}


	@RequestMapping(value = "/employees/{eid}/projects",method = RequestMethod.POST)
	public void addProject(@RequestBody Project proj,@PathVariable int eid)
	{
		proj.setE(new Employee(eid,"",""));
		es.addProject(proj);
	}

	@RequestMapping(value = "/employees/{eid}/projects/{pid}",method = RequestMethod.PUT)
	public void updateProject(@RequestBody Project proj,@PathVariable int eid)
	{	
		proj.setE(new Employee(eid,"",""));
		es.updateProject(proj);
	}
	
	@RequestMapping(value = "/projects/{pid}",method = RequestMethod.DELETE)
	public void deleteProjectById(@PathVariable int pid)
	{
		es.deleteProjectById(pid);
	}
}

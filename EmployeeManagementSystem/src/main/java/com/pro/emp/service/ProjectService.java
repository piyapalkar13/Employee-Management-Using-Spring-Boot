package com.pro.emp.service;

import java.util.List;
import com.pro.emp.model.Project;

public interface ProjectService {

	public List<Project> getProjectList(int eid);

	public List<Project> getAllProjects();

	public Project getProjectById(int pid);

	public void addProject(Project proj);

	public void updateProject(Project proj);

	public void deleteProjectById(int pid);
	
	
}

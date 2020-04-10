package com.pro.emp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Project {

	@Id
	private int pid;
	
	private String pname;

	//one emp can work on multiple Projects
	@ManyToOne
	private Employee e;
	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Project(int pid, String pname, Employee e) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.e = e;
	}


	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Employee getE() {
		return e;
	}

	public void setE(Employee e) {
		this.e = e;
	}
	
	
}

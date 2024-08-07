package com.lgcns.mission.management;

public class Employee {
	private String id, name;
	private Department department;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "ID:" + getId() + " Nama :" + getName() + " Departemen : " +  department.getName();
	}
	
}

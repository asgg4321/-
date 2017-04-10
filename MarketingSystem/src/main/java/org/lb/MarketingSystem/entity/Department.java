package org.lb.MarketingSystem.entity;

import java.util.List;

//部门
public class Department {
	private int DepartmentId;  //部门ID
	private String DepartmentName; //部门
	private List<Position> Positions;  //包含职位
	public int getDepartmentId() {
		return DepartmentId;
	}
	public void setDepartmentId(int departmentId) {
		DepartmentId = departmentId;
	}
	public String getDepartmentName() {
		return DepartmentName;
	}
	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}
	public List<Position> getPositions() {
		return Positions;
	}
	public void setPositions(List<Position> positions) {
		Positions = positions;
	}	
}

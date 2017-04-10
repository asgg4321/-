package org.lb.MarketingSystem.entity;

import java.util.List;

public class Salary {
	private double SalaryNumber;   //薪水数目
	private List<Position> Positions;  //该薪水包含的职位
	public List<Position> getPositions() {
		return Positions;
	}
	public void setPositions(List<Position> positions) {
		Positions = positions;
	}
	public double getSalaryNumber() {
		return SalaryNumber;
	}
	public void setSalaryNumber(double salaryNumber) {
		SalaryNumber = salaryNumber;
	}
}

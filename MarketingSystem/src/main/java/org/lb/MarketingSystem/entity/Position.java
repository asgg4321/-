package org.lb.MarketingSystem.entity;

import java.util.List;

public class Position {	
	private int PositionId;  //职位ID
	private String PositionName;   //职位名称
	private List<CompanyUser> CompanyUsers;    //包含用户
	public List<CompanyUser> getCompanyUsers() {
		return CompanyUsers;
	}
	public void setCompanyUsers(List<CompanyUser> companyUsers) {
		CompanyUsers = companyUsers;
	}
	public int getPositionId() {
		return PositionId;
	}
	public void setPositionId(int positionId) {
		PositionId = positionId;
	}
	public String getPositionName() {
		return PositionName;
	}
	public void setPositionName(String positionName) {
		PositionName = positionName;
	}
	
}

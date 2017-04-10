package org.lb.MarketingSystem.serviceImpl;

import java.util.List;

import org.lb.MarketingSystem.entity.CompanyUser;
import org.lb.MarketingSystem.entity.CustomerUser;
import org.lb.MarketingSystem.entity.Product;
import org.lb.MarketingSystem.service.MarketingSystemService;

public class MarketingSystemServiceImpl implements MarketingSystemService{

	public List<CustomerUser> get_AllCustomerUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateCustomerUser(CustomerUser customerUser) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addCustomerUser(CustomerUser customerUser) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteCustomerUser(CustomerUser customerUser) {
		// TODO Auto-generated method stub
		return false;
	}

	public CustomerUser getConstomerUserByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> get_AllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteProduct(List<Product> products) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Product> getProductsByType(String Type) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> getProductsByPrice(double price1, double price2) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> getProductsByPriceAndType(double price1, double price2, String Type) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateCompanyUser(CompanyUser companyUser) {
		return false;
		// TODO Auto-generated method stub
		
	}

	public boolean deleteCompanyUser(List<CompanyUser> companyUsers) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addCompanyUser(CompanyUser companyUser) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<CompanyUser> getCompanyUserByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<CompanyUser> getCompanyUserBySalary(double salary1, double salary2) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<CompanyUser> getCompanyUserByDepartment(String department) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<CompanyUser> getCompanyUserByPosition(String position) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<CompanyUser> get_allCompanyUser() {
		// TODO Auto-generated method stub
		return null;
	}

}

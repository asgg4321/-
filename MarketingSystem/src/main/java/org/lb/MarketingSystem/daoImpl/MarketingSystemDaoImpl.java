package org.lb.MarketingSystem.daoImpl;

import java.util.List;

import org.lb.MarketingSystem.dao.MarketingSystemDao;
import org.lb.MarketingSystem.entity.CompanyUser;
import org.lb.MarketingSystem.entity.CustomerUser;
import org.lb.MarketingSystem.entity.Product;

public class MarketingSystemDaoImpl implements MarketingSystemDao {

	public List<CustomerUser> select_AllCustomerUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateCustomerUser(CustomerUser customerUser) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean insertCustomerUser(CustomerUser customerUser) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteCustomerUser(CustomerUser customerUser) {
		// TODO Auto-generated method stub
		return false;
	}

	public CustomerUser selectConstomerUserByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> select_AllProducts() {
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

	public boolean insertProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Product> selectProductsByType(String Type) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> selectProductsByPrice(double price1, double price2) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> selectProductsByPriceAndType(double price1, double price2, String Type) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<CompanyUser> select_allCompanyUser() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateCompanyUser(CompanyUser companyUser) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteCompanyUser(List<CompanyUser> companyUsers) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean insertCompanyUser(CompanyUser companyUser) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<CompanyUser> selectCompanyUserByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<CompanyUser> selectCompanyUserBySalary(double salary1, double salary2) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<CompanyUser> selectCompanyUserByDepartment(String department) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<CompanyUser> selectCompanyUserByPosition(String position) {
		// TODO Auto-generated method stub
		return null;
	}

}

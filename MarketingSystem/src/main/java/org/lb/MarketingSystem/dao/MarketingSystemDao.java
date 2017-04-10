package org.lb.MarketingSystem.dao;

import java.util.List;

import org.lb.MarketingSystem.entity.CompanyUser;
import org.lb.MarketingSystem.entity.CustomerUser;
import org.lb.MarketingSystem.entity.Product;

public interface MarketingSystemDao {
	//客户
	public List<CustomerUser> select_AllCustomerUsers();    //查询所有客户信息
	public boolean updateCustomerUser(CustomerUser customerUser); //修改客户信息
	public boolean insertCustomerUser(CustomerUser customerUser);   //插入客户
	public boolean deleteCustomerUser(CustomerUser customerUser);  //删除客户
	public CustomerUser selectConstomerUserByName(String name);  //根据客户名查询客户信息
	
	//产品
	public List<Product> select_AllProducts();    //查询所有产品信息
	public boolean updateProduct(Product product);  //修改产品信息
	public boolean deleteProduct(List<Product> products);   //删除产品
	public boolean insertProduct(Product product);    //插入产品
	public List<Product> selectProductsByType(String Type);   //根据类型查询该类所有产品信息
	public List<Product> selectProductsByPrice(double price1,double price2); //根据价格查询产品信息
	public List<Product> selectProductsByPriceAndType(double price1,double price2,String Type); //根据价格和类型查询产品信息
	
	//员工
	public List<CompanyUser> select_allCompanyUser();  //查询所有员工信息
	public boolean updateCompanyUser(CompanyUser companyUser); //修改员工信息
	public boolean deleteCompanyUser(List<CompanyUser> companyUsers);  //删除员工
	public boolean insertCompanyUser(CompanyUser companyUser);   //插入员工
	public List<CompanyUser> selectCompanyUserByName(String name);    //根据员工姓名查询员工信息
	public List<CompanyUser> selectCompanyUserBySalary(double salary1,double salary2);  //根据员工工资查询员工信息
	public List<CompanyUser> selectCompanyUserByDepartment(String department);  //根据部门查询员工信息
	public List<CompanyUser> selectCompanyUserByPosition(String position);  //根据职位查询员工信息
}

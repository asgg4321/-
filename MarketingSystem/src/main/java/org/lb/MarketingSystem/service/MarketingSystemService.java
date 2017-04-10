package org.lb.MarketingSystem.service;


import java.util.List;

import org.lb.MarketingSystem.entity.CompanyUser;
import org.lb.MarketingSystem.entity.CustomerUser;
import org.lb.MarketingSystem.entity.Product;
public interface MarketingSystemService {
	
	//客户
	public List<CustomerUser> get_AllCustomerUsers();    //得到所有客户信息
	public boolean updateCustomerUser(CustomerUser customerUser); //修改客户信息
	public boolean addCustomerUser(CustomerUser customerUser);   //添加客户
	public boolean deleteCustomerUser(CustomerUser customerUser);  //删除客户
	public CustomerUser getConstomerUserByName(String name);  //根据客户名得到客户信息
	
	//产品
	public List<Product> get_AllProducts();    //得到所有产品信息
	public boolean updateProduct(Product product);  //修改产品信息
	public boolean deleteProduct(List<Product> products);   //删除产品
	public boolean addProduct(Product product);    //添加产品
	public List<Product> getProductsByType(String Type);   //根据类型得到该类所有产品信息
	public List<Product> getProductsByPrice(double price1,double price2); //根据价格得到产品信息
	public List<Product> getProductsByPriceAndType(double price1,double price2,String Type); //根据价格和类型得到产品信息
	
	//员工
	public List<CompanyUser> get_allCompanyUser();  //得到所有员工信息
	public boolean updateCompanyUser(CompanyUser companyUser); //修改员工信息
	public boolean deleteCompanyUser(List<CompanyUser> companyUsers);  //删除员工
	public boolean addCompanyUser(CompanyUser companyUser);   //添加员工
	public List<CompanyUser> getCompanyUserByName(String name);    //根据员工姓名查询员工信息
	public List<CompanyUser> getCompanyUserBySalary(double salary1,double salary2);  //根据员工工资得到员工信息
	public List<CompanyUser> getCompanyUserByDepartment(String department);  //根据部门得到员工信息
	public List<CompanyUser> getCompanyUserByPosition(String position);  //根据职位得到员工信息
	
}

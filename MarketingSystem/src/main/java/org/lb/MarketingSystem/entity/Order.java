package org.lb.MarketingSystem.entity;

import java.util.Date;

//订单
public class Order {
	private String OrderType;  //订单类型
	private Date OrderDate;    //订单时间
	private String Status;     //订单状态
	private Product product;   //交易物品
	private int ProductNum;   //产品数目
 	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getProductNum() {
		return ProductNum;
	}
	public void setProductNum(int productNum) {
		ProductNum = productNum;
	}
	public String getOrderType() {
		return OrderType;
	}
	public void setOrderType(String orderType) {
		OrderType = orderType;
	}
	public Date getOrderDate() {
		return OrderDate;
	}
	public void setOrderDate(Date orderDate) {
		OrderDate = orderDate;
	}
	
}

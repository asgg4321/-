package org.lb.MarketingSystem.entity;

import java.util.List;

public class ProductType {
	private int TypeId;  //类型ID
	private String TypeName; //类型名称
	private List<Product> products;  //该类包含产品
	public int getTypeId() {
		return TypeId;
	}
	public void setTypeId(int typeId) {
		TypeId = typeId;
	}
	public String getTypeName() {
		return TypeName;
	}
	public void setTypeName(String typeName) {
		TypeName = typeName;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
}

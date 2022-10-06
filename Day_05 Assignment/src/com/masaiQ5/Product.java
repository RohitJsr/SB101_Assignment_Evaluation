package com.masaiQ5;

public class Product {
	private int productld ;
	private String productName;
	private int quantity;	
	private int price;
	
	
	
	
	
	public Product(int productld, String productName, int quantity, int price) {
		super();
		this.productld = productld;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}
	public int getProductld() {
		return productld;
	}
	public void setProductld(int productld) {
		this.productld = productld;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [productld=" + productld + ", productName=" + productName + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}
	
	
	

}

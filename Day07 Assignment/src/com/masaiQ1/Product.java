package com.masaiQ1;

public class Product {
	private int productid;
	private String productName;
	private int price;
	private int quantity;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product(int productid, String productName, int price, int quantity) {
		super();
		this.productid = productid;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productName=" + productName + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	public static Object stream() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

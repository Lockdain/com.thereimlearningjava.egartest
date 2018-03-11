package com.thereimlearningjava.egartest.pojo;

import java.io.Serializable;
import java.util.List;


/**
 * POJO для извлечения данных из таблицы orders
 * @author Alex Sergeenko
 * @version 1.0
 */
public class Order {
	
	private int id;
	private String customerName;
	private String customerAddress;
	private float orderAmount;
	private String orderDate;
	
	public Order() {
		
	}
	//Setter в конструкторе
	public Order(int id, String customerName, String customerAddress, float orderAmount, String orderDate) {
		this.id = id;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.orderAmount = orderAmount;
		this.orderDate = orderDate;
	}
	
	//Getters/setters
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerAddress() {
		return this.customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	public float getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(float orderAmount) {
		this.orderAmount = orderAmount;
	}
	
	public String getOrderDate() {
		return this.orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
}

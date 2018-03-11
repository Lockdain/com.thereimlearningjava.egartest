package com.thereimlearningjava.egartest.pojo;

/**
 * POJO для сбора данных из таблиц orders и order_details
 * @author Alex Sergeenko
 * @version 1.0
 */
public class ExtendedOrder {
	//Собирается из таблицы orders
	public int id;
	public String customerName;
	public String customerAddress;
	public float orderAmount;
	public String orderDate;
	
	//Собирается из таблицы order_details
	public String serialNumber;
	public int quantity;
	
	//Конструкторы
	public ExtendedOrder(){
		
	}
	
	ExtendedOrder(int id, String customerName, String customerAddress, float orderAmount, 
			String orderDate, String serialNumber, int quantity){
		this.id = id;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.orderAmount = orderAmount;
		this.orderDate = orderDate;
		this.serialNumber = serialNumber;
		this.quantity = quantity;
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
	
	public String getSerialNumber() {
		return this.serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}

package com.thereimlearningjava.egartest.pojo;

/**
 * POJO для извлечения данных из таблицы order_details
 * @author Alex Sergeenko
 * @version 1.0
 */
public class OrderDetails {
	
	private int idString;
	private String serialNumber;
	private int quantity;
	private int orderId;
	
	//Default constructor
	OrderDetails(){
		
	}
	
	//Parametric constructor
	OrderDetails(String serialNumber, int quantity, int orderId){
		this.serialNumber = serialNumber;
		this.quantity = quantity;
		this.orderId = orderId;
	}
	
	//Getters/setters
	
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
	
	public int getOrderId() {
		return this.orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

}

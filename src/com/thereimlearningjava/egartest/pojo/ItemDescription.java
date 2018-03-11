package com.thereimlearningjava.egartest.pojo;
/**
 * POJO для таблицы item_description
 * @author Alex Sergeenko
 * @version 1.0
 */
public class ItemDescription {
	
	private String serialNumber;
	private String itemName;
	private String itemDesc;
	private String itemMadeOn;
	
	public ItemDescription(){
		
	}
	
	public ItemDescription(String serialNumber, String itemName, String itemDesc, String itemMadeOn){
		this.serialNumber = serialNumber;
		this.itemName = itemName;
		this.itemDesc = itemDesc;
		this.itemMadeOn = itemMadeOn;
	}
	
	//Getters/setters
	public String getSerialNumber() {
		return this.serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public String getItemDesc() {
		return this.itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	
	public String getItemMadeOn() {
		return this.itemMadeOn;
	}
	public void setItemMadeOn(String itemMadeOn) {
		this.itemMadeOn = itemMadeOn;
	}
}

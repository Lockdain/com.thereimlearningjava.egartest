package com.thereimlearningjava.egartest.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.thereimlearningjava.egartest.pojo.ItemDescription;

@ManagedBean
@SessionScoped

/**
 * DAO-класс таблицы item_description
 * @author Alex Sergeenko
 * @version 1.0
 */
public class ItemDescriptionDao implements Serializable{
	
	private static final long serialVersionUID = 
			6081417964063918574L;
	
	public List<ItemDescription> getItemDescs() throws ClassNotFoundException, SQLException{
		
		//Формируем подключение к БД
		Connection connect = null;
		String url = "jdbc:mysql://localhost:3306/CurrOrders";
		String username = "root";
		String password = "root";
		//Подключаем драйвер
			try {
					Class.forName("com.mysql.jdbc.Driver");
					connect = DriverManager.getConnection(url, username, password);
			} catch (SQLException ex) {
					System.out.println("Can't connect to the provided database");
					System.out.println(ex.getMessage());
			}
		
		PreparedStatement prst = connect.prepareStatement("SELECT serial_number, item_name, item_description, item_madeon FROM item_description ORDER BY item_name"); 
		List<ItemDescription> itemDescs = new ArrayList<ItemDescription>(); //коллекция готовых POJO
		
		ResultSet rs = prst.executeQuery();
		
		while (rs.next()) {
			ItemDescription item = new ItemDescription();
			item.setSerialNumber(rs.getString("serial_number"));
			item.setItemName(rs.getString("item_name"));
			item.setItemDesc(rs.getString("item_description"));
			item.setItemMadeOn(rs.getString("item_madeon"));
			
			itemDescs.add(item);
		}
		
		rs.close();
		prst.close();
		connect.close();
		
		return itemDescs;
		
	}

}

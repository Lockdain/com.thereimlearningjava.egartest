package com.thereimlearningjava.egartest.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.thereimlearningjava.egartest.pojo.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
/**
 * DAO POJO Order
 * @author Alex Sergeenko
 *
 */
public class OrderDao implements Serializable{
	private static final long serialVersionUID = 
			6081417964063918994L;
	/**
	 * Возвращает список POJO для таблицы заказов
	 * @return
	 * @author Alex Sergeenko
	 * @version 1.0
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public List<Order> getUsers() throws ClassNotFoundException, SQLException{
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
		
		List<Order> orders = new ArrayList<Order>(); //коллекция списка заказов
		PreparedStatement prst = connect.prepareStatement("SELECT id, customer_name, customer_address, order_amount, order_date FROM orders ORDER BY id");
		
		ResultSet rs = prst.executeQuery(); //выполняем запрос
		
		while (rs.next()) {
			Order orderCur = new Order();
			orderCur.setId(rs.getInt("id"));
			orderCur.setCustomerName(rs.getString("customer_name"));
			orderCur.setCustomerAddress(rs.getString("customer_address"));
			orderCur.setOrderAmount(rs.getFloat("order_amount"));
			orderCur.setOrderDate(rs.getString("order_date"));
			
			orders.add(orderCur);
		}
		
		//Закрываем сессию работы с БД
		rs.close();
		prst.close();
		connect.close();
		
		return orders;
	}

}

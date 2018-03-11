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

import com.thereimlearningjava.egartest.pojo.ExtendedOrder;
import com.thereimlearningjava.egartest.pojo.Order;

@ManagedBean
@SessionScoped
/**
 * DAO POJO ExtendedOrder
 * @author Alex Sergeenko
 *
 */
public class ExtendedOrderDao implements Serializable {
	
	private static final long serialVersionUID = 
			6081417964063918974L;

	/**
	 * Возвращает список POJO для комбинированной таблицы
	 * @return
	 * @author Alex Sergeenko
	 * @version 1.0
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public List<ExtendedOrder> getExtendedOrders() throws ClassNotFoundException, SQLException{
		
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
				
				
				
				List<ExtendedOrder> extendedOrders = new ArrayList<ExtendedOrder>(); //коллекция списка заказов
				PreparedStatement prst = connect.prepareStatement("SELECT id, customer_name, customer_address, order_amount, order_date, serial_number, quantity FROM orders LEFT JOIN order_details ON orders.id=order_details.order_id");
				
				ResultSet rs = prst.executeQuery(); //выполняем запрос
				
				while(rs.next()) {
					ExtendedOrder extOrder = new ExtendedOrder();
					extOrder.setId(rs.getInt("id"));
					extOrder.setCustomerName(rs.getString("customer_name"));
					extOrder.setCustomerAddress(rs.getString("customer_address"));
					extOrder.setOrderAmount(rs.getFloat("order_amount"));
					extOrder.setOrderDate(rs.getString("order_date"));
					extOrder.setSerialNumber(rs.getString("serial_number"));
					extOrder.setQuantity(rs.getInt("quantity"));
					
					extendedOrders.add(extOrder);
				}
				
				//Закрываем подключение к БД
				rs.close();
				prst.close();
				connect.close();
				
				return extendedOrders;
	}
}

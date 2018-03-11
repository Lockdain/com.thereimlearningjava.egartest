package com.thereimlearningjava.egartest.controller;

import com.thereimlearningjava.egartest.dao.*;
import com.thereimlearningjava.egartest.pojo.*;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped


public class OrderController implements Serializable {
	private static final long serialVersionUID = 
			6081417964063218974L;
	/**
	 * Получение списка данных по расширенному заказу
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public List<Order> getOrders() throws ClassNotFoundException, SQLException{
		
		List<Order> orders = new ArrayList<Order>();
		OrderDao od = new OrderDao();
		orders = od.getUsers();
		
		return orders;
	}
}

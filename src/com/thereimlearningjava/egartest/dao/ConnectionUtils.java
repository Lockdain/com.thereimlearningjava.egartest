package com.thereimlearningjava.egartest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
	/**
	 * Возвращает подключение к БД
	 * @throws ClassNotFoundException 
	 */
	Connection connect;
	public Connection getConnection(String username, String password, String DBname) throws ClassNotFoundException {
		
		//Формируем подключение к БД
		connect = null;
		
		StringBuilder url = new StringBuilder();
		url.append("jdbc:mysql://localhost:3306/");
		url.append(DBname);

		//Подключаем драйвер
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(url.toString(), username, password);
		} catch (SQLException ex) {
			System.out.println("Can't connect to the provided database");
			System.out.println(ex.getMessage());
		}
		
		return this.connect;
	}
}

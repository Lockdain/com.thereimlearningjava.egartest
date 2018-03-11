package com.thereimlearningjava.egartest.controller;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.thereimlearningjava.egartest.dao.ExtendedOrderDao;
import com.thereimlearningjava.egartest.pojo.ExtendedOrder;

@ManagedBean
@SessionScoped

public class ExtendedOrderController implements Serializable {
	
	public List<ExtendedOrder> getExtOrders() throws ClassNotFoundException, SQLException{
		List<ExtendedOrder> extOrders = new ArrayList<ExtendedOrder>();
		ExtendedOrderDao extOrdDao = new ExtendedOrderDao();
		extOrders = extOrdDao.getExtendedOrders();
		
		return extOrders;
		
	}
	
	
}

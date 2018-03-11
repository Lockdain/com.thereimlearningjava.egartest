package com.thereimlearningjava.egartest.controller;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.thereimlearningjava.egartest.dao.ItemDescriptionDao;
import com.thereimlearningjava.egartest.pojo.ItemDescription;

@ManagedBean
@SessionScoped
/**
 * Возвращает список POJO для таблицы item_description
 * @author Alex Sergeenko
 *
 */
public class ItemDescriptionController implements Serializable {
	
	private static final long serialVersionUID = 
			6081417964073218974L;

	public List<ItemDescription> getItemDescs() throws ClassNotFoundException, SQLException{
		
		List<ItemDescription> itemDescs = new ArrayList<ItemDescription>();
		ItemDescriptionDao itemDao = new ItemDescriptionDao();
		itemDescs = itemDao.getItemDescs();
		
		return itemDescs;
	}
}

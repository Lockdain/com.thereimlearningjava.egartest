package com.thereimlearningjava.egartest.webservice;

import java.util.Date;

import javax.jws.WebService;

@WebService(endpointInterface="com.thereimlearningjava.egartest.webservice.TimeService")

public class TimeServiceImpl implements TimeService {
	
	public String getDate() {
		Date dt = new Date();
		return dt.toString();
		
	}

}

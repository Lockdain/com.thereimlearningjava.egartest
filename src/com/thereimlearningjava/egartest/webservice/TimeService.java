package com.thereimlearningjava.egartest.webservice;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

public interface TimeService{
	
	@WebMethod public String getDate();
}

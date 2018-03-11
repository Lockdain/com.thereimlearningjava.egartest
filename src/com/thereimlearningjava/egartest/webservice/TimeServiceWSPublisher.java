package com.thereimlearningjava.egartest.webservice;

import javax.xml.ws.Endpoint;

public class TimeServiceWSPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/com.thereimlearningjava.egartest.webservice/TimeService", new TimeServiceImpl());
	}
}

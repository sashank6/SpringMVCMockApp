package com.sashank.Services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class MockService {

	private static final Logger logger = LoggerFactory.getLogger(MockService.class);
	
	public String getServiceName(){
		logger.debug("getServiceName is executed");
		return "MockService";
	}
}

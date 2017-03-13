package com.sashank.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sashank.Services.MockService;

@Controller
public class MockController {
	private final Logger logger = LoggerFactory.getLogger(MockController.class);
	private final MockService mockService;

	@Autowired
	public MockController(MockService mockService) {
		this.mockService = mockService;
	}
	

}

package com.smitiv.schoolApplication.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	private Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	public StudentController() {
		logger.info("{} is created......" , this.getClass().getCanonicalName());
	}
	
	
}

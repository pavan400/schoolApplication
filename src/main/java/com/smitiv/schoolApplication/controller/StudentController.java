package com.smitiv.schoolApplication.controller;

import java.io.Serializable;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.smitiv.schoolApplication.dto.StudentDTO;
import com.smitiv.schoolApplication.service.IStudentService;

@RestController
public class StudentController {

	private Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	public StudentController() {
		logger.info("{} is created......" , this.getClass().getCanonicalName());
	}
	
	@Autowired
	private IStudentService iStudentService;
	
	
	@PostMapping("/saveStudent")
	public ResponseEntity<String> saveStudent(@RequestBody StudentDTO dto){
		Serializable res = iStudentService.saveStudent(dto);
		logger.info("DTO is {}",dto);
		if(res!=null)
			return new ResponseEntity<>("Data Saved....", HttpStatus.CREATED);
		else
			return new ResponseEntity<>("Data Not Saved....", HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("allStudents")
	public ResponseEntity<List<StudentDTO>> getAllStudent(){
		return new ResponseEntity<List<StudentDTO>>(iStudentService.getAllStudents(),HttpStatus.OK);
	}
	
	@PutMapping("/updateById/{stId}")
	public ResponseEntity<String> upadateByStId(@RequestBody StudentDTO dto , @PathVariable Long stId){
		logger.info("PathVariable is {} and DTO is {}",stId, dto);
		return new ResponseEntity<String>(iStudentService.updateById(stId,dto),HttpStatus.OK);
	}
}

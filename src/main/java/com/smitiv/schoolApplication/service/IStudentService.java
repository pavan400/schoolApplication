package com.smitiv.schoolApplication.service;

import java.io.Serializable;
import java.util.List;

import com.smitiv.schoolApplication.dto.StudentDTO;

public interface IStudentService {

	Serializable saveStudent(StudentDTO dto);
	
	List<StudentDTO> getAllStudents();
	
	String updateById(Long stId, StudentDTO dto);
}

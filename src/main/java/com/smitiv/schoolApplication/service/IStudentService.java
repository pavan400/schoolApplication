package com.smitiv.schoolApplication.service;

import java.io.Serializable;

import com.smitiv.schoolApplication.dto.StudentDTO;

public interface IStudentService {

	Serializable saveStudent(StudentDTO dto);
}

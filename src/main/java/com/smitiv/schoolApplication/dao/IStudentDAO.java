package com.smitiv.schoolApplication.dao;

import java.io.Serializable;
import java.util.List;

import com.smitiv.schoolApplication.entity.StudentEntity;

public interface IStudentDAO {

	Serializable saveStudent(StudentEntity entity);
	
	List<StudentEntity> getAllStudents();
	
	String updateById(Long stId, StudentEntity entity);
}

package com.smitiv.schoolApplication.dao;

import java.io.Serializable;

import com.smitiv.schoolApplication.entity.StudentEntity;

public interface IStudentDAO {

	Serializable saveStudent(StudentEntity entity);
}

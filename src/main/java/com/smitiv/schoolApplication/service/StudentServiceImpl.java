package com.smitiv.schoolApplication.service;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smitiv.schoolApplication.dao.IStudentDAO;
import com.smitiv.schoolApplication.dto.StudentDTO;
import com.smitiv.schoolApplication.entity.StudentEntity;

@Service
public class StudentServiceImpl implements IStudentService {

	private Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);

	@Autowired
	private IStudentDAO iStudentDAO;

	public StudentServiceImpl() {
		logger.info("{} is Created....",this.getClass());
	}

	@Override
	public Serializable saveStudent(StudentDTO dto) {
		StudentEntity entity = new StudentEntity();
		BeanUtils.copyProperties(dto, entity);
		
		return iStudentDAO.saveStudent(entity);
	}

}

package com.smitiv.schoolApplication.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smitiv.schoolApplication.entity.StudentEntity;

@Repository
public class StudentDAOImpl implements IStudentDAO {

	@Autowired
	private SessionFactory factory;

	Logger logger = LoggerFactory.getLogger(StudentDAOImpl.class);

	@Override
	public Serializable saveStudent(StudentEntity entity) {
		Session session = factory.openSession();
		try {
			Transaction transaction = session.beginTransaction();
			Serializable res = session.save(entity);
			transaction.commit();
			logger.info("Res is {}", res);
			if (res != null) {
				return res;
			}

		} catch (HibernateException e) {
			logger.error("message is {}, error is {}", e.getMessage(), e);
		} finally {
			session.close();
		}
		return null;
	}
	
	@Override
	public List<StudentEntity> getAllStudents() {
		Session session = factory.openSession();
		try {
			Query query = session.createQuery("FROM StudentEntity");
			List<StudentEntity> list = query.list();
			return list;
		} catch (HibernateException e) {
			logger.error("message is {}, error is {}", e.getMessage(), e);
		} finally {
			session.close();
		}
		return null;
	}
}

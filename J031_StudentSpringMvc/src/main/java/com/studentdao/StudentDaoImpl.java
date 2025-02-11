package com.studentdao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Student;

@Transactional
@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	SessionFactory sf;

	@Override
	public void addorupdateStudent(Student st) {

		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.saveOrUpdate(st);
		tx.commit();

	}

	@Override
	public List<Student> allStudent() {
		Session s = sf.openSession();
		return s.createQuery("from Student").list();
	}

	@Override
	public void delete(int id) {
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.delete(s.get(Student.class, id));
		tx.commit();

	}

	@Override
	public Student StudentById(int id) {
		Session s = sf.openSession();

		return s.get(Student.class, id);
	}

}

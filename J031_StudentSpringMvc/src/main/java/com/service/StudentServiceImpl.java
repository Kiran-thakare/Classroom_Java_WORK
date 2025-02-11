package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Student;
import com.studentdao.StudentDao;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao dao;

	@Override
	public void addorupdateStudent(Student st) {
		// TODO Auto-generated method stub
		dao.addorupdateStudent(st);

	}

	@Override
	public List<Student> allStudent() {
		// TODO Auto-generated method stub
		return dao.allStudent();
	}

	@Override
	public void delete(int id) {
		dao.delete(id);

	}

	@Override
	public Student StudentById(int id) {
		// TODO Auto-generated method stub
		return dao.StudentById(id);
	}

}

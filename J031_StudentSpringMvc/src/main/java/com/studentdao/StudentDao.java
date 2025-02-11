package com.studentdao;

import java.util.List;

import com.model.Student;

public interface StudentDao {

	public void addorupdateStudent(Student st);

	public List<Student> allStudent();

	public void delete(int id);

	public Student StudentById(int id);
}

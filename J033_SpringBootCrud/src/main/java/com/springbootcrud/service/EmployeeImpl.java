package com.springbootcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootcrud.entity.Employee;
import com.springbootcrud.repo.EmployeeRepo;

@Service
public class EmployeeImpl implements EmployeeService {

	@Autowired
	EmployeeRepo repo;

	@Override
	public void addorUpdateEmployee(Employee emp) {
		repo.save(emp);

	}

	@Override
	public List<Employee> allEmployee() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deleteById(int id) {
		repo.deleteById(id);

	}

	@Override
	public Employee editById(int id) {

		return repo.findById(id).get();
	}

}

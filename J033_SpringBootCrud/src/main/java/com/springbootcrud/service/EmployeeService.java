package com.springbootcrud.service;

import java.util.List;

import com.springbootcrud.entity.Employee;

public interface EmployeeService {

	public void addorUpdateEmployee(Employee emp);

	public List<Employee> allEmployee();

	public void deleteById(int id);

	public Employee editById(int id);

}

package com.tedecoders.service;

import java.util.List;

import com.tedecoders.modal.Employee;

public interface EmployeeService {
	public void createEmployee(Employee employee);

	public Employee findById(long id);

	public Employee update(Employee employee, long l);

	public void deleteEmployeeById(long id);

	

	public List<Employee> getEmployee();

	 public Employee updateEmployee(Employee employee, long id);
}

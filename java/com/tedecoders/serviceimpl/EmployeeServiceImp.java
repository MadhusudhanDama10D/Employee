package com.tedecoders.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedecoders.modal.Employee;
import com.tedecoders.repository.EmployeeRepository;
import com.tedecoders.service.EmployeeService;

@Service
public class EmployeeServiceImp implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getEmployee() {
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public Employee findById(long id) {
		return (Employee) employeeRepository.findAll();

	}

	@Override
	public Employee update(Employee employee, long l) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee, long id) {

		Employee updateEmployee = findById(id);
		updateEmployee.setSalary(updateEmployee.getSalary());
		return employeeRepository.save(updateEmployee);
	}

	@Override
	public void createEmployee(Employee employee) {
		employeeRepository.save(employee);

	}

	@Override
	public void deleteEmployeeById(long id) {
		employeeRepository.deleteById(id);

	}

}

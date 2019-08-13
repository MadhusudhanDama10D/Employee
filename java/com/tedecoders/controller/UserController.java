package com.tedecoders.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tedecoders.modal.Employee;
import com.tedecoders.service.EmployeeService;

@RestController
@RequestMapping(value = { "/employee" })
public class UserController {
	@Autowired
	EmployeeService employeeService;

	@GetMapping(value = "/{id}")
	public Employee getEmployeeeById(@PathVariable("id") long id) {
		System.out.println(" id " + id);
		Employee employee = employeeService.findById(id);

		return employee;
	}

	@PostMapping(value = "/create")
	public void createUser(@RequestBody Employee employee) {
		System.out.println("Creating employee " + employee.getName());
		employeeService.createEmployee(employee);

	}

	@GetMapping(value = "/get")
	public List<Employee> getAllEmployees() {
		List<Employee> list = employeeService.getEmployee();
		return list;

	}

	@PutMapping(value = "/update")
	public Employee updateEmployee(@RequestBody Employee newemployee) {
		Employee employee = employeeService.findById(newemployee.getId());
		employeeService.update(newemployee, newemployee.getId());
		return employee;
	}

	@DeleteMapping(value = "/{id}")
	public Employee deleteEmployee(@PathVariable("id") long id) {
		Employee employee = employeeService.findById(id);
		employeeService.deleteEmployeeById(id);
		return employee;
	}

}

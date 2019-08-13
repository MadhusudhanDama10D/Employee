package com.tedecoders.repository;

import org.springframework.data.repository.CrudRepository;

import com.tedecoders.modal.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	
}

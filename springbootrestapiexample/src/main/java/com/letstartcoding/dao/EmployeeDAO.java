package com.letstartcoding.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letstartcoding.model.Employee;
import com.letstartcoding.repository.EmployeeRepository;

@Service
public class EmployeeDAO {

	@Autowired
	EmployeeRepository employeeRepository;

	/* tosaveanemployee */

	public Employee save(Employee emp) {
		return employeeRepository.save(emp);
	}

	/* search all employee */

	public List<Employee> findall() {
		return employeeRepository.findAll();
	}

	/* get an emplyee */

	public Employee findOne(Long empid) {
		return employeeRepository.findOne(empid);
	}

	/* delete an employee */
	public void delete(Employee emp) {
		employeeRepository.delete(emp);
	}
}

package com.letstartcoding.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.letstartcoding.model.Employee;

public interface EmployeeRepository extends	JpaRepository<Employee,Long>{

}

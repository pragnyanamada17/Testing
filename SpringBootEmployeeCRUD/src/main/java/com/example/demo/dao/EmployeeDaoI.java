package com.example.demo.dao;
import java.util.List;

import com.example.demo.entities.Employee;

public interface EmployeeDaoI {
	
	Employee CreateEmployee(Employee emp);
	Employee findEmployeeById(int empId);
	Employee updateEmployee(Employee emp); 
	List<Employee> findAllEmployees();
	void deleteEmployee(int empId);
}

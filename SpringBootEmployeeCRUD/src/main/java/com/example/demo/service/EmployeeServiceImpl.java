package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.EmployeeDaoI;
import com.example.demo.entities.Employee;

@Service

public class EmployeeServiceImpl implements EmployeeServiceI{
	@Autowired
	private EmployeeDaoI dao;
	
	public Employee CreateEmployee(Employee emp) {
		return dao.CreateEmployee(emp);
	}
	
	public Employee findEmployeeById(int empId) {
		return dao.findEmployeeById(empId);
	}
	public Employee updateEmployee(Employee emp) {
		return dao.updateEmployee(emp);
	}
	public List<Employee> findAllEmployees(){
		 return dao.findAllEmployees();
	}
	public void deleteEmployee(int empId) {
		 dao.deleteEmployee(empId);
	}
}

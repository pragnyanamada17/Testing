package com.example.demo.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Employee;

@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDaoI {
	
	@PersistenceContext
    private EntityManager entityManager;

	@Override
	public Employee CreateEmployee(Employee emp) {
		return entityManager.merge(emp);
	}

	@Override
	public Employee findEmployeeById(int empId) {
		return entityManager.find(Employee.class,empId);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Employee emp=new Employee();
		emp.setEmpName(employee.getEmpName());
		emp.setEmpSal(employee.getEmpSal());
		emp=entityManager.merge(emp);
		return emp;
	}
	
	@Override
	public List<Employee> findAllEmployees() {
		Query q = entityManager.createQuery("select e from Employee e");
	    List<Employee> list=q.getResultList();
		return list;
	}
	@Override
	public void deleteEmployee(int empId) {
		Employee emp=entityManager.find(Employee.class, empId);
		entityManager.remove(emp);
	}

}
	

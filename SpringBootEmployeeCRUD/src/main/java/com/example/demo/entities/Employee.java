package com.example.demo.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Employeetable1")
public class Employee {
	@Id
	@GeneratedValue
private int empId;
private String empName;
private long empSal;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public long getEmpSal() {
	return empSal;
}
public void setEmpSal(long empSal) {
	this.empSal = empSal;
}
//constructor
public Employee() {
	super();
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
}


}

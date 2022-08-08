package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
@Id	

private Integer empId;
private String empName;
private String empSal;
public Integer getEmpId() {
	return empId;
}
public void setEmpId(Integer empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpSal() {
	return empSal;
}
public void setEmpSal(String empSal) {
	this.empSal = empSal;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
}
public Employee(Integer empId, String empName, String empSal) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empSal = empSal;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}


}

package com;

import java.util.List;
import java.util.Set;

public class Employee {
private String companyName;
private List<String>empName;
private Set<Integer>empId;
public Employee(String companyName, List<String> empName, Set<Integer> empId) {
	this.companyName = companyName;
	this.empName = empName;
	this.empId = empId;
}
@Override
public String toString() {
	return "Company Name:"+companyName+"\nEmployee Name:"+empName+"\nEmployee Id:"+empId;
}

}

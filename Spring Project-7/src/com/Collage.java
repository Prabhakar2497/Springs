package com;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collage {
private String name;
private List<String>dept;
private Set<String>hod;
private Map<String,Double>details;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getDept() {
	return dept;
}
public void setDept(List<String> dept) {
	this.dept = dept;
}
public Set<String> getHod() {
	return hod;
}
public void setHod(Set<String> hod) {
	this.hod = hod;
}
public Map<String, Double> getDetails() {
	return details;
}
public void setDetails(Map<String, Double> details) {
	this.details = details;
}

}

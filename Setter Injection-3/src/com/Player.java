package com;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Player {
private String name;
private List<Integer>matches;
private Set<Double>average;
private Map<String,Double>details;
public void setName(String name){
	this.name=name;
}
public String getName(){
	return name;
}
public void setMatches(List<Integer>matches){
	this.matches=matches;
}
public List<Integer>getMatches(){
	return matches;
}
public void setAverage(Set<Double>average){
	this.average=average;
}
public Set<Double>getAverage(){
	return average;
}
public void setDetails(Map<String,Double>details){
	this.details=details;
}
public Map<String,Double>getDetails(){
	return details;
}
}

package com;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CricBuzz {
private String name;
private List<String>coach;
private Set<String>team;
private Map<String,Double>details;
public void setName(String name){
	this.name=name;
}
public String getName(){
	return name;
}
public void setCoach(List<String> coach){
	this.coach=coach;
}
public List<String> getCoach(){
	return coach;
}
public void setTeam(Set<String> team){
	this.team=team;
}
public Set<String> getTeam(){
	return team;
}
public void setDetails(Map<String,Double> details){
	this.details=details;
}
public Map<String,Double> getDeatails(){
	return details;
}
}

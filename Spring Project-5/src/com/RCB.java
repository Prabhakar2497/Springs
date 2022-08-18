package com;

public class RCB {
private String name;
private int matches;
public void setName(String name){
	this.name=name;
}
public void setMatches(int matches){
	this.matches=matches;
}
@Override
public String toString(){
	return "Name:"+name+" Matches:"+matches;
}
}

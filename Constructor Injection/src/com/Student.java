package com;

public class Student {
private int stdAge;
private String stdName;
public Student(int stdAge,String stdName){
	this.stdAge=stdAge;
	this.stdName=stdName;
}
public String toString(){
	return "Age:"+stdAge+" Name:"+stdName;
}
}

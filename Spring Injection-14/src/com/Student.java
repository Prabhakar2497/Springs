package com;

public class Student {
private int stuId;
private Laptop laptop;
public Student(int stuId, Laptop laptop) {
	this.stuId = stuId;
	this.laptop = laptop;
}
@Override
public String toString() {
	return "Id:"+stuId+"\n"+laptop;
}


}

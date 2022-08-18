package com;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Solution {
	public static void main(String[] args) {
		 
		ApplicationContext context=new
				ClassPathXmlApplicationContext("config.xml");
		Collage col=(Collage)context.getBean("col");
		System.out.println("Student Name:"+col.getName());
		System.out.println("Department:"+col.getDept());
		System.out.println("Hod:"+col.getHod());
		System.out.println("Course & fees:"+col.getDetails());
	}
}

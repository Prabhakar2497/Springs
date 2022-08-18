package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Solution {
public static void main(String[] args) {
	ApplicationContext context=new
ClassPathXmlApplicationContext("config.xml");
	Student s1=(Student)context.getBean("s1");
	Student s2=(Student)context.getBean("s2");
	System.out.println("Id:"+s1.getId());
	System.out.println("Subjects:"+s1.getSubjects());
	System.out.println("----------------");
	System.out.println("Id:"+s2.getId());
	System.out.println("Subject:"+s2.getSubjects());
}
}
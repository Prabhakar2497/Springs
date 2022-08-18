package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Solution {
public static void main(String[] args) {
	ApplicationContext context=new
ClassPathXmlApplicationContext("config.xml");
	Object obj=context.getBean("s1");
	Student stu=(Student)obj;
	System.out.println("Age:"+stu.getAge());
	System.out.println("Name:"+stu.getName());
}
}

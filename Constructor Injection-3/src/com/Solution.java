package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Solution {
public static void main(String[] args) {
	ApplicationContext context=new 
ClassPathXmlApplicationContext("com/config.xml");
	Student s=(Student)context.getBean("stu");
	System.out.println(s);
}
}

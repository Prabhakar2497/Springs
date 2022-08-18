package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Solution {
public static void main(String[] args) {
	ApplicationContext context=new 
ClassPathXmlApplicationContext("config.xml");
	Student st=(Student)context.getBean("s");
	System.out.println(st);
}
}

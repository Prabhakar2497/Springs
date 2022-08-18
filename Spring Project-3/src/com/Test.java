package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=
			new ClassPathXmlApplicationContext("config.xml");
	Object obj=context.getBean("vk");
	Virat vk=(Virat)obj;
	System.out.println("Matches:"+vk.getMatches());
	System.out.println("Average:"+vk.getAverage());
}
}

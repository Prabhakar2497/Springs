package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Solution {
public static void main(String[] args) {
	ApplicationContext context=
	new ClassPathXmlApplicationContext("config.xml");
	 Object obj1=context.getBean("mob");
	Object obj2=context.getBean("mob1");
	Mobile mob1=(Mobile)obj1;
	Mobile mob2=(Mobile)obj2;
	System.out.println("Brand:"+mob1.getBrand());
	System.out.println("Cost:"+mob1.getCost());
	System.out.println("------------");
	System.out.println("Brand:"+mob2.getBrand());
	System.out.println("Cost:"+mob2.getCost());
}
}

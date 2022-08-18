package org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Solution {
public static void main(String[] args) {
	ApplicationContext context=
new ClassPathXmlApplicationContext("org/person.xml");
	 Person p1=(Person)context.getBean("p1");
	 Person p2=(Person)context.getBean("p2");
	 System.out.println(p1);
	 System.out.println(p2);
}
}

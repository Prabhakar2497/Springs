package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Solution {
public static void main(String[] args) {
ApplicationContext context=new
ClassPathXmlApplicationContext("config.xml");
Employee e1=(Employee)context.getBean("e1");
System.out.println(e1);
}
}

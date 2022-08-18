package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Citizen {
public static void main(String[] args) {
	ApplicationContext context=new 
	ClassPathXmlApplicationContext("config.xml");
	Country country=(Country)context.getBean("c");
	System.out.println("Country:"+country.getCountryName());
	System.out.println("State:"+country.getState().getStateName());
}
}

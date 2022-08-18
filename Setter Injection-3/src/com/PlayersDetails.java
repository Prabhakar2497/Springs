package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlayersDetails {
public static void main(String[] args) {
	ApplicationContext context =new 
ClassPathXmlApplicationContext("config.xml");
	Player p1=(Player)context.getBean("p1");
	System.out.println("Name:"+p1.getName());
	System.out.println("Matches:"+p1.getMatches());
	System.out.println("Average:"+p1.getAverage());
	System.out.println("Venue & Average:"+p1.getDetails());
}
}

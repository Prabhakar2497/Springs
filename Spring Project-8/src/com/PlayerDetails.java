package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlayerDetails {
	public static void main(String[] args) {
		ApplicationContext context=
				new ClassPathXmlApplicationContext("config.xml");
		CricBuzz player1=(CricBuzz)context.getBean("player1");
		System.out.println("Name:"+player1.getName());
		System.out.println("Coach:"+player1.getCoach());
		System.out.println("Team:"+player1.getTeam());
		System.out.println("Series Name & Average:"+player1.getDeatails());
		System.out.println("-------------------");
		CricBuzz player2=(CricBuzz)context.getBean("player2");
		System.out.println("Name:"+player2.getName());
		System.out.println("Coach:"+player2.getCoach());
		System.out.println("Team:"+player2.getTeam());
		System.out.println("Series Name & Average:"+player2.getDeatails());
	}
}

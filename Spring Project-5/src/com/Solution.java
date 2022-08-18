package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Solution {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
 RCB rcb1=(RCB)context.getBean("rcb1");
 RCB rcb2=(RCB)context.getBean("rcb2");
 System.out.println(rcb1);
 System.out.println(rcb2);
  
}

}

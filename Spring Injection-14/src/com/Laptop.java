package com;

public class Laptop {
private String brand;
private int cost;
Laptop(String brand,int cost){
	this.brand=brand;
	this.cost=cost;
}
public String toString(){
	return "Brand:"+brand+"\nCost:"+cost;
}
}

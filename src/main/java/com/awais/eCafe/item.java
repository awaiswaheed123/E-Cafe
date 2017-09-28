package com.awais.eCafe;

public class item {
	String name;
	String type;
	Float price;
	Float time;
	Boolean complete;
	int order_no;
	//creating the item object out of the order list
	public item(String[] order , int order_no) {
		this.name = order[0];
		this.price = Float.parseFloat(order[1]);
		this.type = order[3];
		this.time = Float.parseFloat(order[2]);
		this.order_no = order_no;
		complete = false;
	}
	
}

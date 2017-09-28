package com.awais.eCafe;
import java.util.LinkedList;
import java.util.Queue;
public class Cooks {
	Queue c1,c2,c3,c4;
	public Cooks() {
		 this.c1 = new LinkedList();
		 this.c2 = new LinkedList();
		 this.c3 = new LinkedList();
		 this.c4 = new LinkedList();
	}
	//Distributing the order
	public void insert(item i1) {
		
		if ((c1.size() < c2.size()) && (c1.size() < c3.size()) && (c1.size() < c4.size()) ) { 
		    c1.add(i1);
		} 
		else if ((c2.size() < c3.size()) && (c2.size() < c4.size())) {     
			c2.add(i1);
		} 
		else if ((c3.size() < c4.size())) {                  
			c3.add(i1);
		} 
		else {                                           
			c4.add(i1);
		}
		
	}
}

package com.awais.eCafe;
import com.awais.eCafe.menu;

public class Bill {
	public static int generateBill(int[] order) {
		menu m2 = new menu();
		System.out.println("****** BILL ******");
		int bill = 0;
		for(int i=0; i<order.length; i++) {
			if(order[i] == -1)
				break;
			System.out.println("");
			System.out.println("Item: " + m2.names[order[i]-1][0]);
			System.out.println("Price: " + m2.names[order[i]-1][1]);
			System.out.println("Time to cook: " + m2.names[order[i]-1][2]);
			bill += Integer.parseInt(m2.names[order[i]-1][1]);
		}
		return bill;
	}

	public static int generateTime(int[] order, int input1) {
		menu m2 = new menu();
		int t_cook = 0;
		int t_deliver;
		for(int i=0; i<order.length; i++) {
			if(order[i] == -1)
				break;
			t_cook += Integer.parseInt(m2.names[order[i]-1][2]);
		}
		if(input1 == 1) {
			t_deliver = 30;
		}
		else {
			t_deliver = 5;
		}
		System.out.println("Time to cook: " + t_cook + " minutes.");
		System.out.println("Time to Deliver: " + t_deliver + " minutes.");
		return (t_deliver + t_cook);
	}
}

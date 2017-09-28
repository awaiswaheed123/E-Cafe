package com.awais.eCafe;
import java.util.ArrayList;
import java.util.List;

import com.awais.eCafe.Bill;

public class order extends View {
	menu m1 = new menu();
	Cooks cook = new Cooks();
	List order2 = new ArrayList<item>();
	int[][] order1 = new int[30][10];
	
	public order() {
		this.order1= new int[30][10];
	}
	
	public void placeOrder() {
		int i = 0;
		//Placing order
		do {
			System.out.println("\nOrder Number: " + (i+1));
			System.out.println("Enter -1 to complete order.");
			int j=0;
			int input;
			do {
				System.out.println("Enter Item number to place order.");
				input = (int) inputFloat();
				this.order1[i][j] = input;
				j++;
			}while((j<10)  && (input != -1));
			//distributting work to the cooks
			for(int c = 0; c < order1[i].length ; c++) {
				if(order1[i][c]==-1)
					break;
				int n = order1[i][c]-1;
				item i1 = new item(m1.names[n] , (i+1));//making item objects from the order array
				cook.insert(i1);//sending the item object created to the cook with minimum orders.
			}
			//Checking for TakeAaway/Delivery
			System.out.println("Enter");
			System.out.println("1 for delivery.");
			System.out.println("Any other number for Take-away.");
			int input1 = (int) inputFloat();
			//Generating Bill
			int bill = Bill.generateBill(order1[i]);
			System.out.println("\n\nTotal Bill: " + bill);
			
			int time = Bill.generateTime(order1[i], input1);
			System.out.println("Total Time: " + time + " minutes.");
			i++;
		}while(i<9999);
		System.out.println("Busy.");
	}
}

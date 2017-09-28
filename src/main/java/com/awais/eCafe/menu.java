package com.awais.eCafe;

public class menu {
	String[][] names = new String[15][6];
	public menu(){
		this.names = nameList();
	}
	//Creating the menu
	String[][] nameList() {
		String[][] name1 = new String[15][5];
		int i;
		for(i = 0;i<4;i++) {
				name1[i][1] = "650";
				name1[i][2] = "7";
				name1[i][3] = "Appetizer";
				name1[i][4] = Integer.toString(i+1);
		}
		
		for(i = 4;i<6;i++) {
			name1[i][1] = "400";
			name1[i][2] = "5";
			name1[i][3] = "Soups";
			name1[i][4] = Integer.toString(i+1);
	}
		
		for(i = 6;i<12;i++) {
			name1[i][1] = "900";
			name1[i][2] = "15";
			name1[i][3] = "Main Course";
			name1[i][4] = Integer.toString(i+1);
	}
		
		for(i = 12;i<15;i++) {
			name1[i][1] = "200";
			name1[i][2] = "10";
			name1[i][3] = "Side Course";
			name1[i][4] = Integer.toString(i+1);
	}
		name1[0][0] = "Wings";
		name1[1][0] = "Nachos";
		name1[2][0] = "Chicken Tenders";
		name1[3][0] = "Finger Chicken";
		name1[4][0] = "Hot & Sour Soup";
		name1[5][0] = "Corn Soup";
		name1[6][0] = "Pepper Steak";
		name1[7][0] = "Mushroom Steak";
		name1[8][0] = "Grilled Chicken Steak";
		name1[9][0] = "Stuffed Chicken Steak";
		name1[10][0] = "Alfredo Pasta";
		name1[11][0] = "Rattle Snake Pasta";
		name1[12][0] = "Rice";
		name1[13][0] = "French Fries";
		name1[14][0] = "Mashed Potatoes";
		return name1;
	}
	//displaying menu items
	public void display_menu() {
		System.out.println("******  Welcome to E-Cafe  ******");
		System.out.println("");
		System.out.println("------  Menu  ------");
		for(int i =0 ; i<15 ; i++) {
			
			if(i==0) {
				System.out.println("\n*****Appetizers*****");
			}
			else if(i==4) {
				System.out.println("\n*****Soups*****");
			}
			else if(i==6) {
				System.out.println("\n*****Main Course*****");
			}
			else if(i==12) {
				System.out.println("\n*****Side Course*****");
			}
			
			System.out.print(this.names[i][4] + ". ");
			System.out.println(this.names[i][0]);
			System.out.print("Price: " + this.names[i][1] + "\t");
			System.out.print("Cooking Time: " + this.names[i][2] + "\t");
			System.out.println("");
		}
	}
}

package com.awais.eCafe;


public class App 
{
    public static void main( String[] args )
    {
    	menu m1 = new menu();
        m1.display_menu();
        order o1 = new order();
        o1.placeOrder();
    }
}


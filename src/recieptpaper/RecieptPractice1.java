package recieptpaper;

import java.util.Scanner;

public class RecieptPractice1 {
	
	static String customerName;
	static String productName;
	static double qauntityPurshase;
	static double priceOfProduct;
	static double grossAmountToPay;
	static double netpay;
	static double discount;
	 static Scanner amarScanner= new Scanner(System.in);
	public static void Welcome() {
		System.out.println("hello welcome");
		System.out.println();
	}
	
	public static void getInput() {
		
		System.out.println("Enter your name");
	   
	    customerName=amarScanner.nextLine();
	    System.out.println("Please Enter your product Name");
	    productName=amarScanner.nextLine();
	    System.out.println("Please Enter your qauntityPurshase");
	    qauntityPurshase= amarScanner.nextDouble();
	    System.out.println("Please Enter your priceOfProduct");
	    priceOfProduct=amarScanner.nextDouble();
	    
	    
	}
	public static void calculatGossAmountToPay () {
		grossAmountToPay=qauntityPurshase * priceOfProduct;
		if(grossAmountToPay>0 && grossAmountToPay<100) {
			netpay=grossAmountToPay;
			discount=grossAmountToPay-netpay;
				
		}else if(grossAmountToPay>=100 && grossAmountToPay<500) {
			netpay=grossAmountToPay-5;
			discount=grossAmountToPay-netpay;
		}else if(grossAmountToPay>=500 && grossAmountToPay<1000) {
			netpay=grossAmountToPay-20;
			discount=grossAmountToPay-netpay;
		}else if(grossAmountToPay>=1000) {
			netpay=grossAmountToPay-30;
			discount=grossAmountToPay-netpay;
		}else {
			grossAmountToPay=0;
		System.out.println("ERROR");
		
		}	
		
		
	}
	public static void DisplayOut() {
		
		System.out.println( "Customer Name is: "+customerName +"  My product is:  "
		+  productName + "  qauntityPurshase is:  " + qauntityPurshase +
		"  priceOfProduct is:  "+ priceOfProduct +" gross pay is: " + grossAmountToPay +
		" netpay is:  "+ netpay+" discount is: "+ discount);

		
	}
     public static void main(String[] args) {
    	 Welcome();
    	 getInput();
    	 calculatGossAmountToPay ();
    	 DisplayOut();
}
}

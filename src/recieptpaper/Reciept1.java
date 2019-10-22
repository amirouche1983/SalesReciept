package recieptpaper;

import java.util.Scanner;

public class Reciept1 {

	static String customerName;
	static String productName;
	static double qauntityPurshase;
	static double priceOfProduct;
	static double grossAmountToPay;
	static double netpay;
	static double discount;
    static Scanner amarScanner= new Scanner(System.in);
	 
	
	public static void welcome() {
		System.out.println("welcome to my store");
		System.out.println();
		System.out.println();

		
	}
	
	public static void getInput () {
		System.out.println("Enter Customer Name");
		customerName= amarScanner.nextLine();  
		System.out.println("Enter Product Name");
    	productName=amarScanner.nextLine();
    	System.out.println("Enter qauntity Purshase");
    	qauntityPurshase= amarScanner.nextDouble();
    	System.out.println("Enter priceOfProduct");
    	priceOfProduct=amarScanner.nextDouble();
        
	}
 	
    public static void CalculatGrossAmountToPay () {
    	 
    	grossAmountToPay = qauntityPurshase * priceOfProduct;
	
}
 public static void CalculatNetPayWdiscount () {
	 
	
	 if (grossAmountToPay>0 && grossAmountToPay<100){
     	netpay= grossAmountToPay;
     	discount=grossAmountToPay-netpay;
     } else if (grossAmountToPay>=100 && grossAmountToPay<500 ) {
     			netpay= grossAmountToPay -5;
     			discount=grossAmountToPay-netpay;
     	    }else if (grossAmountToPay>=500 && grossAmountToPay<=1000) {
     	    	netpay= grossAmountToPay -20;
     	    	 discount=grossAmountToPay-netpay;
     	    }else if (grossAmountToPay>1000 ) {
     	    	netpay= grossAmountToPay -30;
     	    	discount=grossAmountToPay-netpay;
     	}else {grossAmountToPay=0;
     	       System.out.println("error");
     	}
       	

 
     	}
  
    
    public static void DisplayOutPut() {
    	System.out.println("===================");
    	System.out.println("Customer Name is :" + customerName);
    	System.out.println("Product Name is :" + productName);
    	System.out.println("Qauntity purshase is  :" + qauntityPurshase );
    	System.out.println("price of product is $ :" +priceOfProduct  );
    	System.out.println("====================");
    	System.out.println("gross pay is $ :" + grossAmountToPay  );
    	System.out.println("net pay is $ :" + netpay);
    	System.out.println("discount is $ :" + discount);
    }
    public static void ExitPrograme() {
    	System.out.println();
    	System.out.println();
    	System.out.println("thank you come again");
    	 
    }
	public static void main(String[] args) {
		 
		
		welcome();
		
		for(int i=0; i<5; i++) {		
			
			System.out.println("customer:" + (i+1 +"###"));
		
		getInput ();
		CalculatGrossAmountToPay ();
		CalculatNetPayWdiscount();
		DisplayOutPut();
	
		String doYouWantToContinue;
		Scanner myScanner = new Scanner (System.in);
		System.out.println("do you want to continue......");
		doYouWantToContinue = myScanner.nextLine();
		if(doYouWantToContinue.equals("no")) 
			break;
			
		
		} 
	
		ExitPrograme();
	}
}


 
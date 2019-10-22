package recieptpaper;

import java.util.Scanner;

public class Reciept2 {

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
		System.out.println("Enter CustomerName");
		customerName= amarScanner.nextLine(); 
		System.out.println("Enter ProductName");
    	productName=amarScanner.nextLine();
    	
    	
    	boolean continueToNextStep;
    	
    	
    	do {
    		try {
    			amarScanner=new Scanner(System.in);
    			
    			System.out.println("Enter qauntityPurshase");
    	    	qauntityPurshase= amarScanner.nextDouble();
    	    	
    	    	if( qauntityPurshase>0) {
    	    		continueToNextStep=true;
    	    		
    	    	}else {
    	    		System.out.println("Enter a quantity >0");
    	    		continueToNextStep=false;
    	    	}
    	    	
    		}catch (Exception Q){
    			System.out.println("please Enter a number >o");
    			continueToNextStep=false;
    		}
    	}while(!continueToNextStep);
    	
    	
    	do {
    		try {
    			amarScanner=new Scanner(System.in);
    			
    			System.out.println("Enter priceOfProduct");
    			priceOfProduct=amarScanner.nextDouble();
    	    	
    	    	if( priceOfProduct>0 && priceOfProduct<=150) {
    	    		continueToNextStep=true;
    	    		
    	    	}else {
    	    		System.out.println("Enter a priceOfProduct between 0-150");
    	    		continueToNextStep=false;
    	    	}
    	    	
    		}catch (Exception p){
    			System.out.println("please Enter a number 0-150");
    			continueToNextStep=false;
    		}
    	}while(!continueToNextStep);
    	
    	
        
	}
	
	public static void calculatSalary() {
		CalculatGrossAmountToPay ();
		CalculatNetPayWdiscount () ;
		
		
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
    
    public static boolean doYouWantToContinue() {
    	
    	String doYouWantToContinue;
		Scanner myScanner = new Scanner (System.in);
		System.out.println("do you want to continue......");
		doYouWantToContinue = myScanner.nextLine();
		if(doYouWantToContinue.equals("yes")) { 
			return true;
    	
		}return false;
    }
	public static void main(String[] args) {
		 
		
		
}

}

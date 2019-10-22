package recieptpaper;

import java.util.Scanner;

public class Reciept0 {

	static String customerName;
	static String productName;
	static double qauntityPurshase;
	static double priceOfProduct;
	static double grossAmountToPay;
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
    	System.out.println("Enter qauntityPurshase");
    	qauntityPurshase= amarScanner.nextDouble();
    	System.out.println("Enter priceOfProduct");
    	priceOfProduct=amarScanner.nextDouble();
        
	}
	
    public static void CalculatGrossAmountToPay () {
    	 
    	grossAmountToPay = qauntityPurshase * priceOfProduct;
	
}
 public static void discount () {
       	

 	if (grossAmountToPay>0 && grossAmountToPay<100){
     	discount=0;
     } else if (grossAmountToPay>=100 && grossAmountToPay<500 ) {
     			discount=5;
     	    }else if (grossAmountToPay>=500 && grossAmountToPay<1000) {
     	    	discount=20;
     	    }else if (grossAmountToPay>=1000 ) {
     	    	discount=30;
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
		discount ();
		DisplayOutPut();
	
		String doYouWantToContinue;
		Scanner myScanner = new Scanner (System.in);
		System.out.println("do you want to continue......");
		doYouWantToContinue = myScanner.nextLine();
		if(doYouWantToContinue.equals("no")) 
			break;
			
		ExitPrograme();
		} 
	
		
	}
}


 
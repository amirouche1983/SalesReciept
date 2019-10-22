package clientreciept;

import recieptpaper.Reciept2;

public class KeyFoodReciept {
	
	Reciept2 KeyFoodReciept =new Reciept2();
	
	public static void main(String[] args) {
	Reciept2 KeyFoodReciept =new Reciept2();

	KeyFoodReciept.welcome();
	
	
	
	for(int i=0; i<5; i++) {		
		
		System.out.println("customer:" + (i+1 +"###"));
	
		KeyFoodReciept.getInput();
		KeyFoodReciept.calculatSalary();
		KeyFoodReciept.DisplayOutPut();
		
	if(!KeyFoodReciept.doYouWantToContinue()) {
	    break;
	
	}
	}
	KeyFoodReciept.ExitPrograme();
}
}
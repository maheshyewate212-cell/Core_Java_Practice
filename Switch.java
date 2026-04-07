//Digit or Number
import java.util.*;

public class Switch{

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter digit");
	int digit = sc.nextInt();
	
	if(digit>0 && digit <= 20)
		System.out.println(" Number between 0 to 20 ");
	
	switch(digit){
		case 0 : System.out.println("ZERO");
				 break;
		case 1 : System.out.println("ONE");
				 break;
		case 2 : System.out.println("TWO");
				 break;
		case 3 : System.out.println("THREE");
				 break;
	    case 4 : System.out.println("FOUR");
				 break;
		case 5 : System.out.println("FIVE");
				 break;
		case 6 : System.out.println("SIX");
				 break;		 
		case 7 : System.out.println("SEVEN");
				 break;		 
		case 8 : System.out.println("EIGHT");
				 break;		 
		case 9 : System.out.println("NINE");
				 break;	
		case 10 : System.out.println("ONE ZERO");
				 break;
		case 11 : System.out.println("ONE ONE");
				 break;
		case 12 : System.out.println(" ONE TWO");
				 break;
		case 13 : System.out.println("ONE THREE");
				 break;
	    case 14 : System.out.println("ONE FOUR");
				 break;
		case 15 : System.out.println("ONE FIVE");
				 break;
		case 16 : System.out.println("ONE SIX");
				 break;		 
		case 17 : System.out.println("ONE SEVEN");
				 break;		 
		case 18 : System.out.println("ONE EIGHT");
				 break;		 
		case 19 : System.out.println("ONE NINE");
				 break;		
		case 20 : System.out.println("TWO ZERO");
				 break;
		default : System.err.println("Loading ....");
               break;		
	}
	
	if(digit > 10 && digit <=20)
		switch(digit){
			
		}
		
	}

}
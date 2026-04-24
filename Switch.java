//Digit or Number
import java.util.*;

public class Switch{

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter digit ");
	int digit = sc.nextInt();
	
	int hundred = digit/100;
	int temp = digit - hundred*100;
	int tens = temp/10;
	int unit= digit%10;
	
	if(digit>0 && digit <= 20){
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
		case 10 : System.out.println("TEN");
				 break;
		case 11 : System.out.println("ELEVEN");
				 break;
		case 12 : System.out.println("TWELVE");
				 break;
		case 13 : System.out.println("THIRTEEN");
				 break;
	    case 14 : System.out.println("FOURTEEN");
				 break;
		case 15 : System.out.println("FIFTEEN");
				 break;
		case 16 : System.out.println("SIXTEEN");
				 break;		 
		case 17 : System.out.println("SEVENTEEN");
				 break;		 
		case 18 : System.out.println("EIGHTEEN");
				 break;		 
		case 19 : System.out.println("NINETEEN");
				 break;		
		case 20 : System.out.println("TWENTY");
				 break;
		default : System.err.println("Loading ....");
               break;		
	}
	}
	
	switch(hundred){
		case 1 : System.out.print("ONE HUNDRED ");
				 break;
		case 2 : System.out.print("TWO HUNDRED ");
				 break;
		case 3 : System.out.print("THREE HUNDRED ");
				 break;
	    case 4 : System.out.print("FOUR HUNDRED ");
				 break;
		case 5 : System.out.print("FIVE HUNDRED ");
				 break;
		case 6 : System.out.print("SIX HUNDRED ");
				 break;		 
		case 7 : System.out.print("SEVEN HUNDRED ");
				 break;		 
		case 8 : System.out.print("EIGHT HUNDRED ");
				 break;		 
		case 9 : System.out.print("NINE HUNDRED ");
				 break;	
	}
	
		switch(tens){
		case 2 : System.out.print("TWENTY ");
				 break;
		case 3 : System.out.print("THIRTY ");
				 break;
	    case 4 : System.out.print("FOURTY ");
				 break;
		case 5 : System.out.print("FIFTY ");
				 break;
		case 6 : System.out.print("SIXTY ");
				 break;		 
		case 7 : System.out.print("SEVENTY ");
				 break;		 
		case 8 : System.out.print("EIGHTY ");
				 break;		 
		case 9 : System.out.print("NINETY ");
				 break;		
		}
		
		switch(unit){
		case 1 : System.out.print("ONE ");
				 break;
		case 2 : System.out.print("TWO ");
				 break;
		case 3 : System.out.print("THREE ");
				 break;
	    case 4 : System.out.print("FOUR ");
				 break;
		case 5 : System.out.print("FIVE ");
				 break;
		case 6 : System.out.print("SIX ");
				 break;		 
		case 7 : System.out.print("SEVEN ");
				 break;		 
		case 8 : System.out.print("EIGHT ");
				 break;		 
		case 9 : System.out.print("NINE ");
				 break;	
			
		}
		
	}

}
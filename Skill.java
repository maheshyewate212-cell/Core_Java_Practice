import java.util.Scanner;

public class Skill{
	public static void main(String args[]){
		System.out.println("Enter a digit");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number <0){
			System.out.print("MINUS ");
			number = -(number);
		}
		int hundred = number /100;
		int no = number - (hundred*100);
		int tens = no/10 ;
		int unit = no % 10 ;
		
		if(number<20){
			switch(number){
			case 0: System.out.println("ZERO");
			break;
			case 1:System.out.println("ONE");
			break;
			case 2:System.out.println("TWO");
			break;
			case 3:System.out.println("THREE");
			break;
			case 4:System.out.println("FOUR");
			break;
			case 5:System.out.println("FIVE");
			break;
			case 6:System.out.println("SIX");
			break;
			case 7:System.out.println("SEVEN");
			break;
			case 8:System.out.println("EIGHT");
			break;
			case 9:System.out.println("NINE");
			break;
			case 10:System.out.println("TEN");
			break;
			case 11:System.out.println("ELEVEN");
			break;
			case 12:System.out.println("TWELVE");
			break;
			case 13:System.out.println("THIRTEEN");
			break;
			case 14:System.out.println("FOURTEEN");
			break;
			case 15:System.out.println("FIFTEEN");
			break;
			case 16:System.out.println("SIXTEEN");
			break;
			case 17:System.out.println("SEVENTEEN");
			break;
			case 18:System.out.println("EIGHTEEN");
			break;
			case 19:System.out.println("NINETEEN");
			break;
		}
		unit = 0;
		}
		/*
			System.out.println(hundred);
			System.out.println(digit);
			System.out.println(rem);
			*/
			
			switch(hundred){
			case 1:System.out.print("ONE HUNDRED ");
			break;
			case 2:System.out.print("TWO HUNDRED ");
			break;
			case 3:System.out.print("THREE HUNDRED ");
			break;
			case 4:System.out.print("FOUR HUNDRED ");
			break;
			case 5:System.out.print("FIVE HUNDRED ");
			break;
			case 6:System.out.print("SIX HUNDRED ");
			break;
			case 7:System.out.print("SEVEN HUNDRED ");
			break;
			case 8:System.out.print("EIGHT HUNDRED ");
			break;
			case 9:System.out.print("NINE HUNDRED ");
			break;
		}

		switch(tens){
			case 2:System.out.print("TWENTY");
			break;
			case 3:System.out.print("THIRTY");
			break;
			case 4:System.out.print("FOURTY");
			break;
			case 5:System.out.print("FIFTY");
			break;
			case 6:System.out.print("SIXTY");
			break;
			case 7:System.out.print("SEVENTY");
			break;
			case 8:System.out.print("EIGHTY");
			break;
			case 9:System.out.print("NINETY");
			break;
		}
		
		switch(unit){
			case 1:System.out.print(" ONE");
			break;
			case 2:System.out.print(" TWO");
			break;
			case 3:System.out.print(" THREE");
			break;
			case 4:System.out.print(" FOUR");
			break;
			case 5:System.out.print(" FIVE");
			break;
			case 6:System.out.print(" SIX");
			break;
			case 7:System.out.print(" SEVEN");
			break;
			case 8:System.out.print(" EIGHT");
			break;
			case 9:System.out.print(" NINE");
			break;
			}
			
			
		
		
		
	}
}
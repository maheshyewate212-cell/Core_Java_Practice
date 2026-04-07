import java.util.*;
public class NumDiv{

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int a = sc.nextInt();	
	
	if(a % 3 == 0)
		System.out.println("Number is divisible by 3");
	if (a % 5 == 0)
		System.out.println("Number is divisible by 5"); 	
	
	System.out.println("Enter the year from 1800 to 2026");
	int year = sc.nextInt();
	
	if(year >= 1800 && year<=2026){
		if(year % 4 == 0){
			System.out.println("Leap Year ");
		}
		else{
			System.out.println("NO leap year");
		}
	}
	else
		System.out.println("Invalid year");
	}
}
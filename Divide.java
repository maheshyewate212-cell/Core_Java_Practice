// Java Program to calculate number divisble by 2,3,5,7,10 & 11
import java.util.Scanner;

public class Divide{

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number ");
	int num = sc.nextInt();
	
	if(num % 2 == 0 )
		System.out.println("Divisible by 2");
	if(num % 3 == 0 )
		System.out.println("Divisible by 3");
	if(num % 5 == 0 )
		System.out.println("Divisible by 5");
	if(num % 11 == 0 )
		System.out.println("Divisible by 11");
	if(num % 7 == 0 )
		System.out.println("Divisible by 7");
	if(num % 10 == 0 )
		System.out.println("Divisible by 10");
	}
	
	if(num % 3==0 && num%5==0){
		System.out.println("Divisible by both");
	}
	else if(num % 3==0)
		System.out.println("Divisible by 3");
	else if(num % 5==0)
	    System.out.println("Divisible by 5");
	
}
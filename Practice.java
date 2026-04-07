import java.util.Scanner;

public class Practice{

	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Number is " );
	int a = sc.nextInt() ;
		
	//Chceks the number is +ve, -ve or zero
	
	if(a>0){
		System.out.println("Number is positive");
	}
	else if (a == 0){
		System.out.println("Number is zero");
	}
	else{
		System.out.println("Number is negative ");
	}
	
	// Checks number is odd or even
	
	if(a % 2 ==0)
		System.out.println("Number is even");
	else
		System.out.println("Number is odd");
	
	//check the greater and smaller number
	
	System.out.println("1st number is " );
	int num1 = sc.nextInt();
	System.out.println("2st number is " );
	int num2 = sc.nextInt();
	
	if(num1 > num2 ){
		System.out.println("Greater number is  "+ num1);
		System.out.println("Smaller number is " + num2);
	}
	if (num2 > num1){
		System.out.println("Greater number is " + num2);
		System.out.println("Smaller number is  "+ num1);
	}
 }
}
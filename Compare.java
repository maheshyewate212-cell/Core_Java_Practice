import java.util.Scanner;

public class Compare{

	public static void main (String[] arg){
	Scanner sc = new Scanner(System.in );
	System.out.println("Enter the number");
	int num = sc.nextInt();
	
	if (num == 25) { 
	System.out.println("Number is 25");
	}
	 if (num < 50) { 
	System.out.println("Number is less than 50");
	} 
	if (num > 100) { 
	System.out.println("Number is greater than 100");
	}
	
	if(num >0 && num<=100)
		System.out.println("Number is between 1 & 100");
	else
		System.out.println("Number is not between 1 & 100");
	
	}

}




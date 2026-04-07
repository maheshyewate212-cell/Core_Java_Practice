import java.util.Scanner;

public class A{

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your choice");
	int num = sc.nextInt();
	
//	   *
//    * *
//   * * *
//  * * * *
// * * * * *
//* * * * * *
//* * * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *
	for(int line = 1; line<=num; line++){
		
		for(int space = num-1; space>=line ; space --){
			System.out.print(" ");
		}
		for(int ast = 1; ast<=line ; ast++){
			System.out.print("* ");
		}
		System.out.println();
	}


	for(int line = 1; line<=num; line++){
		
		for(int space =2 ; space<=line ; space ++){
			System.out.print(" ");
		}
		for(int ast = num; ast>=line ; ast--){
			System.out.print("* ");
		}
		System.out.println();
	}
	
	for(char ch = 'a' ; ch <='z'; ch++){
		System.out.print(ch + " ");
	}
	
	System.out.println();

	for(char ch = 'A' ; ch <='Z'; ch++){
		System.out.print(ch + " ");
	}
		System.out.println();

	for(int line = 1; line<5; line++){
		for(int space = 3; space>=line;space--){
			System.out.print(" ");
		}
		for(char ch = 'a' ; ch <=  ch++){
		System.out.print(ch + " ");
	}
			System.out.println();

		
	}

	}


}
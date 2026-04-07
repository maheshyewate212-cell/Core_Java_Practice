import java.util.Scanner;

public class Key{
	
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
	// right angle triangle
	for(int line = 1; line<= num ; line++){
		for(int ast = 1; ast<=line;ast++){
			System.out.print("* ");
		}
		System.out.println();
	}
	
	System.out.println();
	
	// Reverse Right angle triangle
	for(int line = 1; line<= num; line++){
		for(int ast = num; ast>=line;ast--){
			System.out.print("* ");
		}
		System.out.println();
	}
	System.out.println();
	
	//Number pyramid
	for(int line = 1; line<=num ; line++){
		for(int ast = 1 ; ast<=line; ast++){
			System.out.print(ast + " ");
		}
		System.out.println();
	}
	System.out.println();
	
	//Number pyramid from 2 to n
	for(int line = 2; line<=num ; line++){
		for(int no = 2 ; no<=line;no++){
			System.out.print(no + " ");
		}
				System.out.println();
	}
			System.out.println();
			
	//// Reverse Number pyramid from 2 to n
	for(int line = num; line>=1 ; line--){
		for(int no = 2 ; no<=line;no++){
			System.out.print(no + " ");
		}
				System.out.println();
	}
			System.out.println();
			
	// Diamond Pattern
	for(int line = 1; line<=num ; line++){
		for(int space = num ; space>=line ; space--){
			System.out.print(" ");
		}
		for(int ast = 1; ast <=line ; ast++){
			System.out.print("* ");
		}
		System.out.println();
	}
	
	for(int line = 1; line<=num ; line++){
		for(int space = 1; space<=line; space++){
			System.out.print(" ");
		}
		for(int ast = num ; ast>=line ; ast-- ){
			System.out.print("* ");
		}
		System.out.println();
	}
	
	char ch ='a';
	for(int line=1 ; line<=num ; line++){
		for( ; ch <= line; ch++){
			System.out.print(ch);
		}
		System.out.println();
	}
		System.out.println();

	
	//Number pyramid
	
	

	
	
	}

}
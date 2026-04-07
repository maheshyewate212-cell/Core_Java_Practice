import java.util.Scanner;

public class Checknum{

	public static void main(String[] args){
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("The number is " );
		num = sc.nextInt();
		
		int three = num % 3;
		int five = num % 5;
		
		if(three == 0){
			System.out.println("Hii 3 " );
		}
		else if(five == 0 ){
			System.out.println("Hello 5 " );
		}
		else if(three == 0 & five==0 ){
			System.out.println(" HII & HELLO " );
		}
		else if(three != 0 && five!=0 ){
			System.out.println("No HII & HELLO " );
		}
		
		
		
	}


}
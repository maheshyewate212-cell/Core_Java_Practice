import java.util.Scanner;

public class Practice1{
	
	public void add(int queue){
		
		for(int line = 1; line<=queue;line++){
			for(int ast = queue ; ast>= 1 ; ast--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void num(int no ){
		
		for(int i = no; i>=1;i--){
			for(int j = 1; j<=i ; j++){
				System.out.print(j);
			}
			System.out.println();
		}	
	}
	
	public static void main(String[] args){
		
		Practice1 p = new Practice1();
		
		System.out.println("------------MENU----------");
		System.out.println("1.Square Pattern");
		System.out.println("2.Numbers");
		System.out.println("3. Diamond");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
	    int input = sc.nextInt();
		System.out.println("Enter no of lines");
		int row = sc.nextInt();
		
		switch(input){
			case 1:
			System.out.println("Work is done");
			p.add(row);
			break;
			
			case 2:
			System.out.println("Work in done");
			p.num(row);
			break;
			
			case 3:
			System.out.println("Work in Progress");
			break;
			
			default: System.err.println(" Option not valid");
			break;		
		}
	}

}
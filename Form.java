import java.util.*;

public class Form{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines");
		int queue = sc.nextInt();
	
	for(int line = 1 ; line <= queue ; line++ ){
		for(int ast= 1 ,i=1; ast<=line;ast++ , i++){
			System.out.print("* ");
			}
		System.out.println();
	}
	
	System.out.println();
		
	for(int line = 1; line <=4; line++){
		for(int ast = 4; ast>=line ;ast--){
			System.out.print("* ");
		}
		System.out.println();
	}
	
	for(int line = 2 ; line<=queue; line++){
		for(int num = 2; num<=line ;num++){
			System.out.print(num);
		}
		System.out.println();
	}
		System.out.println();

	for(int line = 1; line<=queue;line++){
		for(int ast = queue; ast>=1;ast--){
			System.out.print("* ");
		}
				System.out.println();
	}
	System.out.println();
	
	for(int line = queue ; line>=1;line--){
		for(int num =2 ; num <= line; num++){
			System.out.print(num);
		}
		System.out.println();
	}

	 System.out.println();
	
	}



}
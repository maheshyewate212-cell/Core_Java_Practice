import java.util.Scanner;

public class Method{

	public static void main(String[] args){
		
	Scanner sc= new Scanner(System.in);
	int num = sc.nextInt();
	
	for(int line =0; line<= num ; line++){
		
		for(int ast = 1; ast<=line ; ast++){
			System.out.print("* ");
		}
		System.out.println();
	}
	
   for(int line = num ; line >=1; line--){
	   for(int ast = 1; ast<=line;ast++){
		 System.out.print("* ");  
	   }
	   System.out.println();  
   }
   
   System.out.println();
   
   for(int  line = 1; line<=num ; line++){
	   for(int space = num; space>line;space--){
		   System.out.print(" ");
	   }
	   for(int ast = 1; ast<=line;ast++){
		   System.out.print("* ");
	   }
	    System.out.println();  
   }
   
   for(int  line = 1; line<=num ; line++){
	   for(int space = 1; space<=line;space++){
		   System.out.print(" ");
	   }
	   for(int ast = num; ast>=1;ast--){
		   System.out.print("* ");
	   }
	    System.out.println();  
   }
	
}

}
import java.util.Scanner;
public class Appy{
	
	/*
	int x =10;
	static int y = 25;
	{
		System.out.println("Instance block ");
		{
			System.out.println("Local block in instance  block  ");
		}
	}
	
	static{
		System.out.println("Static block ");
		{
			System.out.println("Local block in static block  ");
		}
	}
	*/
	 
	 
 public static void main(String args[]){
	 Appy a = new Appy();
	 Scanner sc = new Scanner(System.in);
	 
	 //int prime = sc.nextInt();
	 
	 /*
	 while (i<=prime){
		 if(prime % i ==0){
			 count++;
		 }
		 i++;
	 }
	 
	 if(count == 2){
		 System.out.println(prime + " is Prime Number");
	 }
	 else System.out.println(prime + " is  Not Prime Number");

	 System.out.println(count);
	 System.out.println(i);
	
	 
	 for (int j = 1; j<=prime ; j++){
			 if(prime%j ==0){
				 count++;
			 }
		 }
		  System.out.println(count);
		  
		  if(count == 2){
			  System.out.println(prime + " Number is prime");
		  }
		  else 
			   System.out.println(prime + " Not a Number is prime");
		    */
		   
		  //  int num = sc.nextInt();
			/*
		   // Right angles triangle
		   for(int line = 0 ; line <= num ; line++){
			   
			   for(int ast = 0; ast<=line ; ast++){
				   System.out.print(" * ");
			   }
			   System.out.println();
		   }
		    System.out.println();
		   
		   //square
		   for(int line = 1; line <=num; line++){
			   for (int squa =1; squa<= num; squa++){
				   System.out.print("* ");
			   }
			   System.out.println();
		   }
		   
		   System.out.println();
		   //Pyramid
		   for (int line = 1;line<=num; line++){
			  for(int space =num; space>line ; space--){
				 System.out.print(" ");
			 }
			 
			 for(int ast =1; ast<=line ; ast++){
				 System.out.print("* ");
			 }   
			   System.out.println();
		   }
		      System.out.println();
		   
		   int i=1;
		   
		   while(i<=num){
			   int j = 1;
			   while(j<=num){
				   System.out.print("* ");
				   j++;
			   }
			   System.out.println();
			   i++;
		   }
		   
		   
		   for(int line =1; line<=5;line++){
			   int number =1;
			   for(; number<=line ; number++){
				   System.out.print(number);
			   }
			   System.out.println();
		   }
		   
		   int count = 0;
		   int num =1;
		   for(int line =1; line<=5; line++){
			   for(int no = 1; no<=line;no++){
				   System.out.print(num + " ");
				   num++;
			   }
			    System.out.println();
		   }
		   
		   char c ='z';
			 for(int line = 1; line<=5;line++){
				 for(int loop =1; loop<=line;loop++){
					 System.out.print(c + " ");
					 c--;
				 }
				 System.out.println();
			 }
		  
		  for(char ch = 'a';ch <'h';ch++){
			   for(char dh = 'a';dh<=ch;dh++){
				   System.out.print(c + " ");
				   c++;
			   }
			   System.out.println();
		   }
		   */
		   
		   for(int line =1; line<=5;line++){
			   for(int ast=5;ast>=line;ast--){
				   System.out.print("* ");
			   }
			   System.out.println();
		   }
		   System.out.println();
		   
		   for(int line= 1; line<=5 ; line++){
		   
		   for(int space = 5; space>line ; space--){
			   System.out.print(" ");
		   }
		   for(int ast =1; ast<=line;ast++){
			   System.out.print("*");
		   }
		   System.out.println();
		   }
		   
		   
		   
	 }
	 
}
import java.util.Scanner;

public class Skills{
 /*
	public void Square(){
	
	for(int line =1; line<=5;line++){
	    for(int ast=1;ast<=5;ast++){
		    System.out.print("* ");
	       }
	System.out.println();
	  }	
   }
   
   public void Star(){
	
	for(int line =1; line<=5;line++){
	    for(int ast=1;ast<=line;ast++){
		    System.out.print("* ");
	       }
	System.out.println();
	  }	
   }
   
    public int Number(int n){
	  int num = 1;
	for(int line =1; line<=n;line++){
	    for(int ast=1;ast<=line;ast++){
		    System.out.print(num + " ");
			num++;
	       }
	System.out.println();
	  }
return 1;	  
   }
   
   
   public int NumSame(int n){
	   for(int line = 1; line<=n;line++){
		   int count = 1;
		   for(int ast = 1; ast<=line ;ast++){
			   System.out.print(count + " ");
			   count++;
		   }
		   System.out.println();
	   }
	   return 0;
   }
   
   public int RevNum(int n){
	   int count = 15;
	   for(int line = 1; line<=n; line++){
		   for(int ast= n; ast>=line;ast--){
			   System.out.print(count + " ");
			   count--;
		   }
		   System.out.println();
	   }
	   return 0;
   }
   
   Hollow Square
   for(int line =1 ; line<=5; line++){
		for(int ast = 1; ast<= 5 ; ast++){
			if(ast == 1 || line ==1 || line ==5 || ast ==5 || ast == line || ast == 5 - line +1){
				System.out.print("* ");
			}
			else{
				System.out.print("  ");
			}
		}
			System.out.println();
		}
		
	for(int line = 1; line <=5; line++){
		for(int space = 4; space>=line ; space--){
			System.out.print(" ");
		}
		for(int ast = 1; ast <= line ; ast++){
			if(ast ==1 || line ==5 || ast == line){
			System.out.print("* ");
			}
			else{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
*/


public static void main(String[] args){
     Skills s = new Skills();
	/* s.Square();
	 s.Star();
	 s.Number(5);
	 s.NumSame(7);*/
	// s.RevNum(5);
	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	/*
	for(int line = 1 ; line<= n ; line++){
		
		for(int ast =1; ast<=line; ast++){
			System.out.print("* ");
		}
		
		System.out.println();
	}
System.out.println();

    for(int line =1 ; line<=n;line++){
        for(int ast = n; ast>=line ;ast--){
	       System.out.print("* ");
	     }
	
	System.out.println();
  }
  
  for(int line =1; line<=n; line++){
	  for(int num =1 ; num<=line;num++){
		  System.out.print(num+3+" ");
	  }
	  System.out.println();
  }
  
  for(int line =1 ; line<=n;line++){
	  for(int num = 1; num<=line;num++){
		  System.out.print( num + "*");
	  }
	  System.out.println();
  }
  
  for(int line = 1; line<=n; line++){
	  for(int space = n-1; space>=line;space--){
		  System.out.print(" ");
	  }
	  for(int ast = 1; ast<=line;ast++){
		  System.out.print("* ");
	  }
	  System.out.println();
  }
  System.out.println();
  
  for(int line =1 ; line<=n; line++){
	  for(int ast =1; ast<=n;ast++){
		  if(line ==1 || line ==n || ast ==1 || ast ==n || ast ==line || ast == n-line+1){
		  System.out.print("* ");
		  }
		  else{
			  System.out.print("  ");
		  }
	  }
	  System.out.println();
  }
  */
  
  /*
  for(int line =1 ; line<= n ; line++){
	  for(int ast = 1; ast<=n ; ast++){
		  if (ast == line || ast+line == n+1 || line ==1 || line == n ){
			  System.out.print("* ");
		  }
		  else{
			  System.out.print("  ");
		  }
	  }
	  System.out.println();
  }

  
  for(int line =1 ; line<=n ; line++){
	  for(int ast = 1; ast<=n; ast++){
		  if(ast == (n/2) || line == n/2 || ast == line || ast+ line == n){
			  System.out.print("* ");
		  }
		  else{
			  System.out.print("  ");
		  }
	  }
	  System.out.println();
  }
    */
	
	for(int line =1 ; line<=n ; line++){
		
		for(int space = n ;space>line;space--){
			System.out.print(" ");
		}
		
		int count =1;
		for(int ast = 1; ast<=line;ast++){
			
			if(ast== 1|| ast == line|| line == n ){
			System.out.print("* ");
			}
			else{
				System.out.print(count + " ");
			count++;	
			}
		}
		  System.out.println();
  }
}
}

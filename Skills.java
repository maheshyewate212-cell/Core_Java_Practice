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
	int nums=1;
	
	/*
	for(int line =1; line<=n; line++){
		for(int ast =1; ast<=line;ast++){
			System.out.print("*");
		}
		for(int space =n*2-1;space>=2*line;space--){
			System.out.print(" ");
		}
		for(int ast =1; ast<=line;ast++){
			System.out.print("*");
		}
		System.out.println();
	}
	for(int line =n-1; line>=1; line--){
		for(int ast =1; ast<=line;ast++){
			System.out.print("*");
		}
		for(int space =n*2-1;space>=2*line;space--){
			System.out.print(" ");
		}
		for(int ast =1; ast<=line;ast++){
			System.out.print("*");
		}
		System.out.println();
	}*/
	
	for(int line =1; line<=n; line++){
		for(int ast =1; ast<=line;ast++){
			System.out.print(nums);
		}
		for(int space =n*2-1;space>=2*line;space--){
			System.out.print(" ");
		}
		for(int ast =1; ast<=line;ast++){
			System.out.print(nums);
		}
		System.out.println();
	}
	
	for(int line =n-1; line>=1; line--){
		for(int ast =1; ast<=line;ast++){
			System.out.print(nums);
		}
		for(int space =n*2-1;space>=2*line;space--){
			System.out.print(" ");
		}
		for(int ast =1; ast<=line;ast++){
			System.out.print(nums);
		}
		System.out.println();
	}
	
	
	/*1
     1 1
    1 2 1
   1 2 3 1

	for(int line =1; line<=n ; line++){
		for(int space = n; space>line; space--){
			System.out.print(" ");
		}
		for(int right=1; right<=line;right++){
			if(right ==1 || right == line){
			System.out.print(nums+" ");
			}
			else{
			System.out.print(right+" ");	
			}
		}
		System.out.println();
	}
	
	System.out.println();
	int digit =1;
	*/
	
	/*
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20

	for(int line=1;line<=5;line++){
		for(int num=1;num<=5;num++){
			if(line%2!=0){
			System.out.print(digit+" ");
			digit++;
			}
			else{
				System.out.print(digit+" ");
			digit++;
			}
		}
		System.out.println();
	}
	
	*/
	
	/*
	for(int line = 1; line<=n; line++){
		for(int space =1; space<line ; space++){
			System.out.print(" ");
		}
		
		for(int ast = n; ast>= line; ast--){
			System.out.print("* ");
		}
		System.out.println();
	
	for(int line = 2; line<=n; line++){
		for(int space =n; space>line ; space--){
			System.out.print(" ");
		}
		
		for(int ast = 1; ast<= line; ast++){
			System.out.print("* ");
		}
		System.out.println();
	}
	

	// ODD STARS DIAMOND
	for(int line = 1; line<=n; line++){
		for(int space = n; space>line ;space--){
			System.out.print(" ");
		}
		for(int ast=1; ast<=line*2-1;ast++){
			System.out.print("*");
		}
		System.out.println();
	}
		for(int line = n-1; line>=1; line--){
		for(int space = n; space>line ;space--){
			System.out.print(" ");
		}
		for(int ast=1; ast<=line*2-1;ast++){
			System.out.print("*");
		}
		System.out.println();
	}
	
	// Diamond Pattern
	for(int line =1 ; line<=n; line++){
		for(int space = n;space>line; space--){
			System.out.print(" ");
		}
		for(int ast =1; ast<=line ; ast++){
			System.out.print("* ");
		}
		System.out.println();
	}
	for(int line=2; line<=n; line++){
		for(int space =1 ;space<line ;space++){
			System.out.print(" ");
		}
		for(int ast = n;ast>=line;ast--){
			System.out.print("* ");
		}
		System.out.println();
	}
	

	for(int line =1 ; line<=n; line++){
		for(int space = n; space>line ; space--){
			System.out.print(" ");
		}
		for(int ast = 1; ast <=line; ast++){
			System.out.print("* ");
		}
		System.out.println();
	}
	
	for(int line = n-1; line>=1 ; line--){
		for(int space =n; space>line; space--){
			System.out.print(" ");
		}
	for(int ast = 1; ast<=line ; ast++){
		System.out.print("* ");
	}	
	System.out.println();
	}
	
	
	for(int line = 1; line<= n;line++){
		int no =line;
		
		for(int space = n ; space>line; space--){
			System.out.print(" ");
		}
		for(int num = 1 ; num<=line ; num ++){
			while(no >=1){
			System.out.print(no +"");
			no--;
			}
			 if(num>1){
				System.out.print(num +"");
			 }
			
		}
		
		System.out.println();
	}
	
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
		  if(ast == (n/2) || line == n/2 || ast == line || ast+ line == n+1){
			  System.out.print("* ");
		  }
		  else{
			  System.out.print("  ");
		  }
	  }
	  System.out.println();
  }
   
  
   	int count =1;
  	for(int line =1 ; line<=n ; line++){
		
		for(int space = n ;space>line;space--){
			System.out.print(" ");
		}
		
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
 
  for(int line = 1; line<= n; line++){
	  int number=1;
	  if(line %2 ==0){
	  for(int ast =1 ; ast<=line; ast++){
		  System.out.print("* ");
	  }
	  }
	  else{
		  for(int i = 1; i<=line; i++){
			  System.out.print(number + " ");
			  number++;
		  }
		  System.out.print("  ");
	  }
	  System.out.println();
  }
	
	int num =1;
	char ch ='a';
    for(int line = 1; line<= n; line++){
		if(line%2==0){
			for(int i=1; i<=line; i++){
				System.out.print(ch + " ");
				ch++;
			}
		}
		else{
		  for(int i=1; i<=line; i++){
				System.out.print(num + " ");
				num++;
			}	
		}
	System.out.println();
  }
 
  
  System.out.println("-");
  
  int zero = 0; 
  int one  = 1;
  
  for(int line =1; line<=n ; line++){
			
		  if(line % 2 ==0){
			  for(int p =1 ; p<= line; p++){
			  System.out.print(one + " ");
			  System.out.print(zero +" ");
			  }   
		  }
		  else{
			   for(int q =1 ; q<= line; q++){
			   System.out.print(zero +" ");
			   System.out.print(one + " ");
			  }
			  }
		  System.out.println();
	  }
	  
	  /*
	   System.out.println();
	   
	   for(int line =1; line<=n ; line++){
		   
		   for(int ast =1 ; ast<=n ; ast++){
			   if(ast == (n/2)+1 || line == (n/2)+1 || ast == line || ast == n-line +1){
			   System.out.print("* ");
			   }
			   else{
				System.out.print("  ");   
			   }
		   }
		   System.out.println();
	   }
	   
	   for(int line =1 ; line<=n; line++){
		   
		   for(int ast = 1; ast<=n ; ast++){
			   if(ast == 1 || line == n || ast == 2){
			   System.out.print("* ");
			   }
			   else{
				   System.out.print("  ");
			   }
		   }		   
		   
		   System.out.println();
	   }
	   
	      for(int line =1 ; line<=n; line++){
		   
		   for(int ast = 1; ast<=line ; ast++){
			   if((ast+line) %2 !=0){
				   System.out.print("0 ");
			   }
			   else{
			   System.out.print("1 "); 
			   }
		   }		   
		   System.out.println();
	   }
	    */
	   
	   
	  
  }
}

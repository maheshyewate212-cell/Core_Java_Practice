public class Swap{
	 
	public static void main(String[] args){
	 
	 int a = 10;
	 int b = 20;
	 int c = 0;
	 
	 System.out.println("Before swaping using 3rd variable the values are : ");
	 System.out.println( "Value of a is "  + a);
	 System.out.println("Vlaue of b is  " + b);
	 System.out.println("Value of c is " + c);
	 System.out.println();
	 
	 c = a;
	 a = b;
	 b = c ;
	 c=0;
	 
	 System.out.println("After swaping using 3rd variable the values are : ");
	 System.out.println( "Value of a is "  + a);
	 System.out.println("Vlaue of b is  " + b);
	 System.out.println("Value of c is " + c);
	 
	
	System.out.println();
	System.out.println("Before swaping without using 3rd variable the values are : ");
	System.out.println( "Value of a is "  + a);
	System.out.println("Vlaue of b is  " + b);
		
		a = a+b;
	    b = a - b;
		a = a-b;
	
	System.out.println();
	System.out.println("After swaping without using 3rd variable the values are : ");
	System.out.println( "Value of a is "  + a);
	System.out.println("Vlaue of b is  " + b);
	
	}


}
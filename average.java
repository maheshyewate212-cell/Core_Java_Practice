// Calculate Average , Square and Cube of the numbers & perimeter of circle
public class average{
	
	public static void main(String[] args){
	 int x= 15;
	 int y= 7;
	 int z= 15;
	 int a = 12;
	 
	 System.out.println();
	 float average = (float)(x+y+z+a) / 4;
	 System.out.println("The average of 4 number is " + average);
	 
	 System.out.println();
	 int square = x * x;
	 System.out.println(" The square of 15 is " + square);
	 
	 System.out.println();
	 int cube = y*y*y;
	 System.out.println("The cube of the 7 is " + cube );
	 
	System.out.println();
	System.out.println("Perimeter of the Circle");
	 float radius = 2.5f;
	 float pi = 3.1415926f;
	 
	 float perimeter = (float)(2 * pi * radius);
	 System.out.println("The perimeter of circle having radius 2.5 is "+perimeter + " sq.units");
	 
	
	}

}
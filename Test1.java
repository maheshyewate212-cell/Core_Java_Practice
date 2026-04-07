public class Test1{ 
 //blocks

/* {
	 x =200;
	System.out.println("This is the instance block" + x);
	
 }
 
 static{
	 y=20;
	 	 Test1 m = new Test1();
		 System.out.println("This is the Static block " + y);
		 {
			 Test1 n = new Test1();
			 System.out.println("This is a local block");
		 }
 }
 */
 
 public static void main(String args[]){
	
	/* Test1 t = new Test1();
	// Test1 t1 = new Test1();
	 
	 t.x = t.x+y;
	 y =t. x-y;
	 
	  System.out.println(t.x);
	  
	  y=y-10;
	  System.out.println(y);
	  */
	  
	  /*int b = 130;
	  byte x = (byte)b;
	  
	   byte y = 125;
	  char ch = (char)y;
	 
	  System.out.println(y);*/
	  
	// System.out.println(x);
	
	

//🟢 EASY LEVEL (Build Basics)
//Print your name, age, and city using variables.

String name = "Mahesh";
int age = 23;
String city = "Pune";

	  System.out.println("My name is " + name);
	  System.out.println("My age is "+ age);
	  System.out.println("My city is " + city);

//Take two integers and print their sum, difference, product, and division.
int a=25,b=5;
int sum = a+b;
int diff = a-b;
int prod = a*b;
float div = a/b;
System.out.println("Sum is " + sum );
System.out.println("Diff is " + diff );
System.out.println("product is " + prod );
System.out.println("div is " + div );

//Check whether a number is even or odd.
if(a%2==0)
	System.out.println("a is even no");
else
	System.out.println("a is odd no");

//Check whether a number is positive, negative, or zero.
if(a>0) System.out.println("No. is Positive");
else if(a==0) System.out.println("No is zero");
else System.out.println("Number is negative");

//Swap two numbers using a third variable.
int c=a;
a=b;
b=c;
System .out.println("Vlaue of a "+a);
System.out.println("Value of b is "+b);

//Type Casting
double d = a;
System.out.println(d);
double e = 66;
a=(int)e;
System.out.println("Valueof a is "+ a);

if (a%5==0 && a%11 ==0) System.out.println("Divisible by 5 & 11");
else if(a%5 ==0) System.out.println("Divisible by 5");
else if (a%11 == 0) System.out.println("Divisible by 11");
else System.out.println("NOt in range of 5 &11");

for(int no = 65; no<91;no++){
char ch = (char) no;
System.out.println(ch + " = " + no);
}

for(char f ='a' ; f<='z' ; f++){
	int n = f;
	System.out.println(f + " = " + n);
}


 }


}
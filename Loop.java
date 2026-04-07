import java.util.Scanner;
public class Loop{

public static void main(String[] args){
	int a=5 , b=6;
	do{
		System.out.println("Hii...!");
	}
	while(a==b);
	System.out.println("Continue main");  
	
	//for loop
	for (int i=1 , j= 2; i<5 & j > 5 ; i++ , j++){
		System.out.print( i);
		System.out.println( j);	
	}
	
	//for loop even numbers
	//for(int i = 0 ; i<0 && i<=100 ; i+=2 ){
	//	System.out.print(i + " ");
	//}
	
	//another method for evene number
	//for(int i =1 ; i<=100 ; i++){
	//	if(i%2==0)
	//		System.out.print(i);
	//}
	
	//program to calculate factorial 
	//e.g 5!= 5*4*3*2*1
	//5!=5*(5-1)*(5-2)*(5-3)*(5-4)
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number");
	int num = sc.nextInt();
	long fact=num;
	
	if(num<0)
	{
	System.out.println("The factorial of "+ num +" is undefined");
	}
	else if(num>20){
		System.out.println(" Number is out of range ");
	}
	else
	{
	for (int i =1 ;i<num; i++)
	{
	fact= fact * i;	
	}
	System.out.println(fact);
	}
	
	
	System.out.println();
	
	


	
	
	//int fact = num*(num-1)*(num-2)*(num-3)*(num-4);
	//System.out.println(fact);
	
	
	
	for (int i =1 ; i<5;i++){
		for(int j =1 ;j<=i ; j++){
			System.out.print("* ");
		}
		System.out.println(" ");
	}
	System.out.println(" ");
	
	for (int line =4 ; line>=1;line--){
		for(int ast =1 ;ast<=line ; ast++){
			System.out.print("* ");
		}
		System.out.println(" ");
	}
	}
	
	
}

}
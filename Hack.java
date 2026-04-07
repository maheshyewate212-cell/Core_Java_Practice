import java.util.Scanner;

public class Hack{

public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 
 int n = sc.nextInt();
 
 if(n>0 && n<101){
 
     if(n%2 != 0){
	   System.out.println("Weird ");
      }
	  else if(n<1 && n>6){
	 System.out.println("Not Weird");
      }
     else if(n>5 && n<21){
	 System.out.println("Weird ");
      }
     else{
	 System.out.println(" Not Weird ");
      }
}
 else{
	  System.out.println("Number is not in range");
      }

}

}
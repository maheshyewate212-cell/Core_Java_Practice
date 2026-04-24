import java.util.Scanner;

public class Apple{
	
public static void main(String [] Aditya){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter your age : ");
	int age = sc.nextInt();
	
	System.out.print("Enter Monthly Income $ :  ");
	int income = sc.nextInt();
	
	System.out.print("Enter Credit Score : ");
	int creditScore = sc.nextInt();
	
	System.out.print("Enter Employment Type :Salaried,Self-employed or Unemployed : ");
	String employment = sc.next();
	
	System.out.print("Enter Existing Loan Amount : ");
	int loanAmount = sc.nextInt();
	
	float interest =0;
	float maxloan = 0;
	String category = "";
	
	System.out.println();
	
	if((age<21 || age>65)|| (creditScore <500) || (income<25000) || (employment.equalsIgnoreCase("Unemployed"))){
		System.out.print(" ->Sorry ! Your profile is not eligible for loan");
	}
	else{
		System.out.println(" ->Congratulations!! Your profile is eligible for loan ");
		
		System.out.println();
		System.out.print("Loan Category -> ");
		
		if(income>= 100000)
		{
		category= "Premium";
		System.out.print(category);
		maxloan= income*60;
		}
		else if((income>=50000)&&(income<=99999))
		{
		category= "Standard";
        System.out.print(category);
		maxloan= income*40;
		}
		else if((income>=25000)&&(income<=49999))
		{
		category= "Basic";
		System.out.print(category);
		maxloan= income*20;
		}
		
		System.out.println();
		System.out.print("Base Interest Rate by Credit Score -> ");
		
		if((creditScore<=850)&& (creditScore>=750)) {
			interest = 7;
			}
		else if((creditScore<=749)&& (creditScore>=650)) {
			interest = 9;
			}
		else if((creditScore<=649)&& (creditScore>=500)){
			interest = 12;
			}
		System.out.print(interest+ "% ");
		
		System.out.println();
		System.out.print("Adjustments to Interest Rate -> ");
		
		if(employment.equalsIgnoreCase("Self-employed")){
			interest= interest+1.5f;
		}
		if(loanAmount > 500000){
			interest= interest+2;
		}
		if(age>55){
			interest= interest+1;
		}	
		 if(income>= 100000){
			interest= interest-1;
		}
		 if(creditScore >800){
			interest= interest-0.5f;
		}
		System.out.print(interest+"%");
		
		System.out.println();
		System.out.print("Max Loan Amount -> ");
		
		
		System.out.print(maxloan+" ");
		
	    System.out.println();
		
		if(loanAmount >(0.5f * maxloan)){
			System.out.print("Reduced Max Loan Amount -> ");
			maxloan = maxloan - (0.3f * maxloan);
			System.out.print(maxloan+" ");
		}
		
		}	
	}
}

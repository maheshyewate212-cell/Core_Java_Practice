public class DeclareVar{

	public static void main(String[] args){
     
	byte age = 27;
	short year = 2026;
	int value = 1900;
	long salary = 47500;
	char id = 'A';
	boolean isWorking = true;
	float interest = 2.25f;
	double promotion = 49200.75;
	
	System.out.println("Decalred Variables");
	System.out.println("The age is " + age);
	System.out.println("The year is " + year);
	System.out.println("The value is " + value);
	System.out.println("The Salary is " + salary);
	System.out.println("The ID is " + id + ".");
	System.out.println("Is employee  working ?  " + isWorking);
	System.out.println("The monthly interest is " + interest);
	System.out.println("The after promotion salary is " +promotion);
	
	{
		System.out.println("This is the instance block ");
	}
	
	static{
		System.out.println("This is the static block ");
	}

		
	}
}


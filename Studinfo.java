// program for 1)Checks the number is +ve , -ve or zero 2)Display the Students Information
//3)Calculate the percentage of the Marks 4)Calculate the Gross salary 

public class Studinfo{

	public static void main(String[] args){
	
	int rollno = 32;
	String ch = "Mahesh";
	int physics = 96;
	int biology = 97;
	int chemistry = 92;
	int M1 = 93;
	int English = 94;
	int Hindi = 90;
	
	int totalMarks = 600;
	
	//Checks the number is +ve , -ve or zero
	System.out.println();
	//System.out.println("Check the number is +ve , -ve or zero");
	if(rollno > 0)
		System.out.println("Roll number is Positive");
	else if(rollno == 0)
		System.out.println("Roll number is zero");
	else if(rollno < 0)
		System.out.println("Roll number is negative");
	System.out.println();
	
	//Display the Students Information
	System.out.println("The roll no of student is " + rollno);
	System.out.println("The name of Student is " + ch );
	System.out.println("Physics " + physics);
	System.out.println("Biology " + biology);
	System.out.println("Chemistry " + chemistry);
	System.out.println("Maths " + M1);
	System.out.println("English " + English);
	System.out.println("Hindi " + Hindi);
	
	// Calculate the percentage of the Marks
	
	float ConvertPercent = (float)(physics + biology + chemistry + M1 + English + Hindi)/totalMarks;
	float Percent = ConvertPercent*100;
	System.out.println("The percentage of all subject is  " + Percent);
	
	
	// Calculate the Gross salary 
	int Salary = 50000;
	int homeAllowance = 15000;
	int transportAllowance = 5000;
    int healthAllowance = 10000;
	int savings = 5000;
	
	System.out.println();
	int grossSalary = Salary + homeAllowance + transportAllowance + healthAllowance + savings;
	System.out.println("The Gross Salary is " + grossSalary);
	
	}
}
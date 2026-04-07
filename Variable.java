//Types of Variables 

public class Variable{
	
	int x = 5; // Instance 
	static float pi = 3.142f;//static
	
	public void main(){
		int x = 32; // local Variable
		System.out.println("Local Variable is " +x);
	}
		
	public static void main(String[] args){
	
	Variable c1 = new Variable();
	Variable c2 = new Variable();
	Variable c3 = new Variable();
	Variable c4 = new Variable();
	
	c4.main();
	c2.x=20;
	c3.x=15 + c2.x;
	c1.pi = 10 + c1.x; 
	
	System.out.println();
	System.out.println("Instance var " + c1.x);
	System.out.println("Instance var " +c2.x);
	System.out.println("Instance var " +c3.x);
	System.out.println("Static Variable "+c1.pi);
	}


	static{
		System.out.println("This is the Static block");
	}
	
	{
		System.out.println("This is the instance block");
		{
			System.out.println("This is the local block");
		}
	}
	
	
}
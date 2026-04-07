public class TypeCast{
	// question 3 & 4
	
	// Implicit TypeCasting
    int i = 19;
	long l = i;
	
	//Explicit TypeCasting
	byte b = (byte) l;
	float f = (float) l;
	
  public static void main(String[] args){
	 TypeCast obj1 = new TypeCast();
	 
	System.out.println("Implicit Typecasting is : "); 
    System.out.println(obj1.i);
	System.out.println(obj1.l);
	
	System.out.println("Explicit Typecasting is : "); 
    System.out.println(obj1.b);
	 System.out.println(obj1.f);
  }

}
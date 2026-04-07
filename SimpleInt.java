// Calculate Simple Interest

public class SimpleInt{

	public static void main(String[] args){
	
	float amount = 50000f;
	float rate = 5f;
	float year = 3f;
	
	System.out.println("Amount before interest  $" + amount);
	float interest =  (amount * rate * year )/ 100;
	
	System.out.println("Interest to be added in principal amount  $" + interest);
	
     amount = amount + interest;
	System.out.println("Amount after interest  $" + amount);
	
	}
}
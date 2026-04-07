public class DayConvert{

	public static void main(String[] args){
	
	int days = 800;
	
	int year = days / 365;
	int remainDays = days % 365;
	
	
	int week = remainDays / 7;
	int finalDays = remainDays % 7;
	
	System.out.println("Total Days " + days);
	System.out.println( "Days "+ finalDays);
	System.out.println("Weeks "+ week);
	System.out.println("Year "+ year);
	
	}

}
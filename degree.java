//Convert degree Celsius to Fahrenheit

public class degree{
     float x = 37;
	 
	 public void celsiustoFahrenheit(){
		 System.out.println( "The degree celsius is " + x);
		 float convert = ( x * 9/5 ) + 32;
		 System.out.println("The equivalent fahrenheit temperature is  " + convert);
	 }

	public static void main(String[] args){
		degree d1 = new degree();
		
		d1.celsiustoFahrenheit();
	}
}


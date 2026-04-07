// Verify character as a UpperCase , LowerCase & distinguish Vowels & Consonants
import java.util.*;

public class Alphabets{

	public static void main(String[] arfs){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the alphabet ");
	char ch = sc.next().charAt(0);
	
	
	if( ch >='a' && ch<= 'z')
		System.out.println("LowerCase Alphabet " + ch);
	if( ch >='A' && ch<= 'Z')
		System.out.println("UpperCase Alphabet " + ch);
	
	if((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') || (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'))
		System.out.println("Vowel " + ch );
	if((ch != 'a' || ch != 'e' || ch != 'i' || ch != 'o' || ch != 'u') || (ch != 'A' || ch != 'E' || ch != 'I' || ch != 'O' || ch != 'U'))
		System.out.println("Consonants " + ch );
	}

}
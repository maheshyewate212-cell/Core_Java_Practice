public class B{
	
	public static void main(String[] args){
    
	for(int line=1 ; line<=5 ; line++){
		char ch ='a';
		for(int ast = 1 ; ast <= line; ast++){
			System.out.print(ch + " ");
			ch++;
		}
		System.out.println();
	}
	
	for(int line =1 ; line<=5; line++){
		for(int n = 1; n <=line; n++){
			System.out.print(n);
			System.out.print("*");
		}
		System.out.println();
	}
	
	for(int line = 1; line <=5; line++){
		char ch ='a';
		for(int space = 5 ;space>=line;space--){
			System.out.print(" ");
		}
		for(int ast = 1; ast<=line ; ast++){
			System.out.print(ch + " ");
			ch++;
		}
		System.out.println();
	}
	
	
	for(int line =4 ; line>=1 ; line--){
		for(int ast = 1;ast<=(line*2); ast++ ){
			System.out.print("* ");
			for(int space = line*2; space>=0; space-=2){
				System.out.print(" ");
			}
			
		}
		System.out.println();
	}
	
	
	}	
}
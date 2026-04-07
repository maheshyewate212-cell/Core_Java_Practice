public class Pattern{
	
public static void main(String[] args){
	
	
	
	for(int line = 1; line <=4;line++){
		for(int num = 2; num<=line+1;num++){
			System.out.print(num +" ");
		}
		System.out.println();
	}
	
	for(int line= 1; line<=5;line++){
		for (int num =1 ,x=3; num<=line ;num++ , x++){
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	for (int line = 4; line>=1;line--){
		for(int num = 2; num<=line;num++){
			System.out.print(num);
		}
		System.out.println();
	}
	
}

}
import java.util.Scanner;

public class Book{

	public static void main(String[] args){
	
	int [] arr = {12,32,46,97,11,27,52};
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	int num = sc.nextInt();	
	
	for(int i =0;i<arr.length ; i++){
		if(arr[i] == num){
		System.out.println("Elememt " + arr[i] + " found at index " + i);
		}
   	}
	
	for(int j = 1 ; j<=arr.length-1 ; j++){
	for(int i = 0 ; i< arr.length-1 ; i++){
		if(arr[i] > arr[i+1]){
			int extra = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = extra;
		}
	}
	}
	
	for(int i =0;i<arr.length ; i++){
		System.out.print(arr[i] + " ,");
	}
	
	
}


}
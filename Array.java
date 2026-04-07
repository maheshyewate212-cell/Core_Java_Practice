public class Array{
 
 public static void main(String[] args){
	int[] arr = {32,46,2,37,49,17,21,12,200,33};
	int index = 0;
	System.out.println(" String representation of INT array object");
	System.out.println(arr);
	System.out.println();
		
	System.out.println("Elemnets in the array from START");
	for(int i = 0; i< arr.length ; i++){
		System.out.print(arr[i] + " ");
	}
		System.out.println();
		
	System.out.println("Elemnets in the array from END");
	int in = arr.length-1;
	while(in>=0){
		System.out.print(arr[in] + " ");
		in--;
	}
	System.out.println();
	
	System.out.println("Even numbers from start");
	while(index < arr.length){
		if(arr[index] %2 ==0)
		System.out.println(arr[index]);
		index++;
	}
	System.out.println();
	
	System.out.println("Even numbers from end");
	for(int i = arr.length-1 ; i>=0 ; i--){
		if(arr[i] % 2==0)
		System.out.println(arr[i]);
	}
 System.out.println();
 
 System.out.println(" Sum of array elemnts usinf FOR loop");
	int sum =0 ;
	for(int i = 0; i<arr.length;i++){
		sum = sum +arr[i];
	}
	System.out.println(sum);
	
	
	System.out.println(" Sum of array elemnts usinf WHILE loop");
	while(index < arr.length){
		sum = sum + arr[index];
		index++;	
	}
   System.out.println(sum);
 
 }

}
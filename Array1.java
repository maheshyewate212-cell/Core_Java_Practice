import java.util.Scanner;
import java.util.Arrays;

public class Array1{

	 public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//int n= sc.nextInt();
		
		int b[][] = new int[3][];
		/*
		for(int i=0; i<b.length; i++){
			for(int c=0;c<b[i].length;c++){
				b[i][c] = sc.nextInt();
			}
		}
		
		for(int i=0; i<b.length; i++){
			for(int c=0;c<b[i].length;c++){
			System.out.print(b[i][c]+ " " );
			}
		}
		*/
		
		//Three ways to display the Array elements
		int a[] = {12,32,11,32,12};
		System.out.println(Arrays.toString(a));
		
		for(int x:a){
			System.out.print(x+ " ");
		}
		
		int [][] a= new int[3][3];
		
		for(int row =0;row<a.length;row++){
			for(int col=0; col<a[row].length;col++){
				
			}
		}
		
		
	/*	
		//Input to an array
		int a[]  = new int[n];
		
		for(int i =0; i< a.length;i++){
			a[i] =sc.nextInt();
		}
		
		for(int i =0; i< a.length;i++){
			System.out.print(a[i]+ " " );
		}
	
	int a[] = {12,32,11,32,12};
	int i=0 ,j=a.length-1;
	boolean isPalindrome = false;
	
	while(i<=j){
		if(a[i] == a[j]){
			isPalindrome = true;
		}
		else{
		isPalindrome = false;	
		}
		i++;
		j--;
	}
	System.out.println("Is Given Array Palindrome -> "+ isPalindrome);
		
     int arrr[] ={12,10,22,15,16};	 
	int reverse [] = new int[arrr.length];
	
	int i =0;
	for(int x= arrr.length-1 ; x>=0 ; x--){
		//System.out.println(arrr[x]);
		reverse[i] = arrr[x];
		i++;	
	}
	for(int z = 0 ; z< reverse.length; z++){
			System.out.print(reverse[z] + " " );
		}
		System.out.println();
		
		// Spiral Runway of array elements
		for(int j = 0 ; j<arrr.length; j++){
			int temp = arrr[0];
			for(int n = 0; n<arrr.length-1; n++){
				arrr[n] = arrr[n+1];
			}
			arrr[arrr.length-1] = temp;
			
			System.out.print(arrr[0] + " ");
			System.out.print(arrr[1] + " ");
			System.out.print(arrr[2] + " ");
			System.out.print(arrr[3] + " ");
			System.out.print(arrr[4] + " ");	
			System.out.println();
			}
			
		 // Spiral Sliding of array elements
		 	 int spiral [] = {19,18,10,12};
		 System.out.println("Main Array -> {19,18,10,12} ");
		 for(int i = 0 ; i<spiral.length-1;i++){
		
			 int temp = spiral[0];
			 spiral[0] = spiral[1];
			 spiral[1]= spiral[2];
			 spiral[2] = spiral[3];
			 spiral[3]= temp;
			
			System.out.print(spiral[0] + " ");
			System.out.print(spiral[1] + " ");
			System.out.print(spiral[2] + " ");
		    System.out.print(spiral[3] + " ");
			
			System.out.println();
		 }
		 System.out.println();
		 
	 int b[] = {12,18,52,42,30};
		 for(int i = 0 ; i<b.length ; i++){
			 int temp = b[0];
			 for(int c = 0 ; c< b.length-1 ; c++){
				 b[c] = b[c+1];
			 }
			 b[b.length-1] = temp;
			 
			 for(int j = 0 ; j<b.length; j++){
				 System.out.print(b[j] +" ");
			 }
			 System.out.println();
		 }
		 
		 // Addition of subarrays and finding the max sum
		 int max[][]={{12,32,42},{10,15},{11,22,33,44},{1,2,3}};
		 int result [] = new int[max.length];
		  
		 for(int p = 0; p<max.length; p++){
			 int sum =0;
			 for(int c =0 ; c<max[p].length;c++){
					sum = sum+max[p][c];
			 }
			 result[p] = sum;
		 }
		 
		 int maxresult =0 ;
		 for(int i = 0 ; i<result.length; i++){
		 System.out.println(result[i]);

		 if((result[i] > maxresult)){
			 maxresult = result[i];
		 }
		 System.out.println(maxresult);
		 }
		 
	  int count=0;
	  for(int e = 0; e<arr.length ; e++){
		  if(arr[e] % 2== 0){
			  count++;
		  }
	  }
	 System.out.println("Even Count of Numbers  "+ count);
	 
	 int sum = 0;
	 int esum =0 , osum =0;
	 
	  for(int e = 0; e<arr.length ; e++){
		  sum = sum+arr[e];
		  
		  if(arr[e] %2 !=0){
			  osum = osum+arr[e];
		  }
		  else{
			  esum= esum+arr[e];
		  }
	  }
	  System.out.println("Sum of all array elements "+ sum);
	  System.out.println("Sum of all even elements "+ esum);
	  System.out.println("Sum of all odd elements "+ osum);
	  
	    // to find duplicates
	   int counter =0;
	   for(int p1 =0 ; p1<arr.length;p1++){
		  for(int p2= p1+1; p2<arr.length;p2++){
			  if(arr[p1] == arr[p2]){
				  counter++;
			  }
		  }
		  if(counter >=1){
		  System.out.println(arr[p1]+ " is duplicate  "+ (counter +1));
		  }
		  counter =0;
	  }
	  
	  //To sort the array need to be test
	  	  for(int p1= 0; p1<arr.length ; p1++){
		  for(int p2= p1+1; p2<arr.length;p2++){
			  if(arr[p1] > arr[p2]){
				  int temp = arr[p1];
				  arr[p1] = arr[p2];
				  arr[p1] = temp;
			  }
			  }
		  }
	  
	  for(int i = 0 ; i<arr.length; i++){
		  System.out.print(arr[i] + "  ");
	  }

	  //int arr [] = {5,63,32,47,31,45,99,55,10,1 ,0};
	  int arr[] = {12,5,7,10};
	 
	 for(int p1 = 0; p1<arr.length ; p1++){
		 int no = arr[p1];
		 for(int c1 = p1+1;c1<arr.length;c1++){
			 if(no >arr[c1]){
				 int temp = no; 
				 arr[p1] = arr[c1];
				 arr[c1] = temp;
			 }
		 }
	 }
	 
	 for(int element: arr){
		 System.out.print(element + " ");
	 }
 
 int threeD [][][]={{2,1,{12,10}},{7,9,{15,16}}};
 System.out.println(threeD[0][0][0]);
 */
 



/*
int arr[][] ={{1,2,3},{14,35},{6,7,8,9}};
int arr1 []={20,19,21,22,25};
int sumeach =0;

for(int i =0; i<arr1.length-1; i++){
	
		int temp = arr1[i];
		arr1[i] = arr1[i+1];
		arr1[i+1]= temp;
	
	for(int j=0; j<arr1.length; j++){
	System.out.print(arr1[j] + " ");
	}
	
	System.out.println(" ");
}

int maxno =0;
int maxIndex = 0;

for(int a=0;a<arr1.length; a++){
	if(maxno<arr1[a]){
		maxno = arr1[a]; 
		maxIndex = a;
	}
}
System.out.println(maxno + " -> "+ maxIndex);

for(int rar: arr1){
	sumeach = sumeach+rar;
	System.out.println(sumeach);
}*/

/*
int sum =0;
for(int p1 =0; p1<arr.length; p1++){
	for(int c1 = 0 ; c1<arr[p1].length; c1++){
		if((p1==0 && c1 ==0) || (p1 == 1 && c1 ==0) || (p1 ==2 && c1==0)){
			sum = sum+ arr[p1][c1];
		}
		
		
		// Logic for oth index elemnt sum of each subarray
		if(c1 ==0){
			sum = sum + arr[p1][c1];
		}
		
		//Logic for last index element sum of each sub array
		if(c1 == arr[p1].length-1){
			sum = sum + arr[p1][c1];
		}
	}
}
System.out.println(" Sum of 0th index element " + sum);
*/

/*
// Sum of elements having same index as parent (00,11,22)
int sum =0;
for(int p1 =0; p1<arr.length; p1++){
	for(int c1 = 0 ; c1<arr[p1].length; c1++){
		if(c1 == p1){
			sum = sum+ arr[p1][c1];
		}
	}
	System.out.println(" Sum of 0th index element " + sum);
}

for(int p = 0 ; p<arr.length; p++){
	int count =0;
	
	for(int c =0; c<arr[p].length ; c++){
		int prime = arr[p][c];
	    
        for(int pr = 1; pr<=prime; pr++){
			if(prime % pr ==0){
				count ++;
			}
		}	
    if(count ==2){		
	System.out.println(" prime " + prime);
       }
	}
}

//Subarrays Sum & finding the biggest sum
	int sum0 =0;
	int sum1 =0;
	int sum2 =0;

for(int p1 =0 ; p1<arr.length;p1++){

	if(p1==0){
	for(int c1 = 0; c1<arr[p1].length; c1++){
	sum0 = sum0 + arr[p1][c1];
	}
	}
	else if(p1==1){
	for(int c1 = 0; c1<arr[p1].length; c1++){
	sum1 = sum1 + arr[p1][c1];
	}
	}
	else if(p1==2){
	for(int c1 = 0; c1<arr[p1].length; c1++){
	sum2 = sum2 + arr[p1][c1];
	}
	}
}
	System.out.println("0 th : "+ sum0);
	System.out.println("1 st  : "+ sum1);
	System.out.println("2 nd : "+ sum2);
	
	if((sum0 > sum1) && (sum0 > sum2)){
		System.out.print("Sum of 1st Subarray is Greater which is  "+sum0);
	}
	else if((sum0 < sum1) && (sum1 > sum2)){
		System.out.print("Sum of 2nd Subarray is Greater which is  "+sum1);
	}
	else if((sum2 > sum1) && (sum0 < sum2)){
		System.out.print("Sum of 3rd Subarray is Greater which is  "+sum2);
	}
	
	System.out.println();
	*/

	  /*
	  
	  //MIN number in ARRAY
	  	  int num = arr[0];
	  int index =0;
	
	for(int i = 0; i<arr.length; i++){
		
		  if(num > arr[i]){
			  num = arr[i];
			  index = i;
		  } 
	  }
	  System.out.println("Min num is : "+num + " at index "+ index );
	  
	  //MAX number in ARRAY
	  for(int i = 0; i<arr.length; i++){
		  if(num < arr[i]){
			  num = arr[i];
			  index = i;
		  }
	  }
	  System.out.println("Max num is : "+num + " at index "+ index );
	  
	   //Is ARRAY PALINDROME
	 int arr1[] = {1,2,3,2,1};
	 
	 int i = 0, j=arr1.length-1;
	 boolean isPalindrome = false;
	 
	 while(i<=j){
		 if(arr1[i] == arr1[j]){
			 isPalindrome = true;
			 break;
		 }
		 i = i+1;
		 j=j-1;
	 }
	 if(isPalindrome){
		 System.out.println(" Palindrome " );
	 }
	 else{
		 System.out.println("No Palindrome ");
	 }
	  
	  //Reverse the array 
	  	 int result[] = new int[arr.length];
	 int  i =0, j= arr.length-1;
	 int k = arr.length-1;
	 
	 while(i<arr.length){
		 result[k] = arr[i];
		 k= k-1;
		 i= i+1;
	 }
	 
	 for(int z=0;z<result.length;z++){
		 System.out.print(result[z] + " ");
	 }
	  
	 //Print missing number in an array
	int arr[] = {3,5,9,12,15 ,23};
	
	int i =0, j=1;
	while((i<arr.length) && (j<arr.length)){
		int no = arr[i] +1;
		
		while((no>arr[i]) && (no<arr[j])){
			System.out.print(no + " ,");
			no++;
		}
		i=i+1;
		j=j+1;
	}
	System.out.println();
	   
	  //Checks 1st and last elements are divisible by each other
	 while(i<j){
		 if((arr[i]%arr[j] == 0) || (arr[j]%arr[i]==0)){
			 System.out.println(arr[i]+ " " + arr[j] + " are divisble ");
		 }
		 else{
			System.out.println(arr[i]+ " " + arr[j] + " not divisble ");
		 }
		 i=i+1;
		 j=j-1;
	 }
	 
	    // Sum of 1st and last element of even length
	 while(i<j){
		 int sum = arr[i]+arr[j];
		  System.out.print(arr[i] +" + " + arr[j] + " = " + sum);
		 i=i+1;
		 j=j-1;
		
		 System.out.println(); 
	 }
	 
	 	 //Array Reverse Program
	 int i = 0, j = arr.length-1;
	 
	 for(int line = 0 ; line<arr.length;line++){
		 System.out.print( arr[line] + " ,");
	 }
	 System.out.println();
	 
	 while(i<j){
		 int temp = arr[i];
		 arr[i] = arr[j];
		 arr[j] = temp;
		 
		 i = i+1;
		 j=j-1;
	 }
	 for(int line = 0 ; line<arr.length;line++){
		 System.out.print( arr[line] + " ,");
	 }
	 
	 System.out.println();
	 
	 
	 //Addition of Even & Odd numbers in Array
	 int evenresult=0 ;
	 int oddresult =0;
	 
	 for(int i = 0; i<arr.length; i++){
		 if(arr[i] % 2==0){
			evenresult = evenresult+arr[i];
		 }
		 else{
			oddresult = oddresult + arr[i];
		 }
	 }
	 System.out.println(" Even no sum : " +evenresult);
	 System.out.println(" Odd no sum : " +oddresult);

	  System.out.println();
	  
	  System.out.println( "Digits in an Array ");
	 for(int i = 0 ; i<arr.length; i++){
		 if(arr[i]>0 && arr[i]<10){
			 System.out.print(arr[i] + " ");
		 } 
	 }
	 
	 for(int j=0; j<arr.length; j++){
	 int count =0;
	 int n=arr[j];
	 
	 for(int i =1; i<=n; i++){
		 if(n%i==0){
			count++;
		 }
	 }
	 
	 if(count == 2){
		// System.out.print("Count is " + count);
		System.out.println(" Prime number " + n); 
	 }
	 }
	
	 // Duplicates in an Array
	 for(int j=0;j<arr.length ;j++){
	 int num =arr[j];
	 int count =0;
	 
	 for(int i=0;i<arr.length ;i++){
		 
			 if( num == arr[i]){
				 count++;
			 }
			 else{
				 //System.out.print("");
			 }
		// System.out.println();
	 }
	 if(count>1){
		 System.out.print("Count is : " +count);
		 System.out.println(  " Duplicate no.  " + num);
		 
	 }
	 else{
		 //System.out.println("No Duplicate   "+ num);
		 // System.out.println(count);
	 }
	 }

	for(int line =1 ; line<=8 ;line++){
		 char s = 'a';
		 int no =1;
		if(line %2 ==0){
			for(int ch =1;ch <= line ; ch++){
				System.out.print(s + " ");
				s++;
			}
		}
		else{
			for(int ast = 1; ast<=line ; ast++){
				System.out.print( no + " ");
				no++;
			}
		}
		
		System.out.println();
	}	
	
	for(int line =1 ; line<=8 ; line++){
		 char s = 'a';
		 int no =1;
		if(line%2 ==0){
			for(int i = 1;i<=line ; i++){
				System.out.print( no + " ");
				no++;
			}
		}
		else{
			for(int ch =1;ch <= line ; ch++){
				System.out.print(s + " ");
				s++;
			}
		}
		System.out.println();
	}
	
	//Hollow triangle with numbers inside
	for(int line=1; line<=8 ; line++){
		for(int space = 8;space>line;space--){
			System.out.print(" ");
		}
		int i =1;
		for(int ast = 1; ast<=line ; ast++){
			
			if(ast ==1 || ast == line || line == 8){
			System.out.print("* ");
			}
			else{
			System.out.print(i + " ");
             i++;					
		}
	}
	System.out.println();
 }
 */
 
	
	
	
	
	
	
	}
}
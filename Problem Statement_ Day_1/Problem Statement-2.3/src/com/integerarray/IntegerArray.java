package com.integerarray;

public class IntegerArray {
	public static void main(String[] args) {
		int arr[]= {3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
		int length=arr.length;
		System.out.println(arr.length);
		
		for(int i=0;i<=14;i++) {
			arr[15]= arr[15]+arr[i];
		}
		System.out.println("Sum of elements from index 0 to 14 is "+arr[15]);
        arr[16]=arr[15]/length;
		System.out.println("Average of all elements is "+arr[16]);
		arr[17]=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] <arr[17])
				
				arr[17] = arr[i];
			
			System.out.print(arr[i]+" ");
			
	        }
		
	        System.out.println("\nSmallest value from the array: " +arr[17]);
		}
	} 
  



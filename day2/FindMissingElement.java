package week1.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]= {1,4,3,2,8, 6, 7}; 
			Arrays.sort(arr);
		
			/*
			 * for(int i=0;i<arr.length-1;i++) { if(arr[i]+1!=arr[i+1]) {
			 * System.out.println(arr[i]+1); break; } }
			 */
			
			int sum=0;
			for (int i = 0; i < arr.length; i++) {
				sum=sum+arr[i];
			}
			
			int sum1=0;
			for (int j = 1; j <=8; j++) {
				sum1=sum1+j;
								
			}
			System.out.println(sum);
			System.out.println(sum1);
			System.out.println("The missing number is: " +(sum1-sum));
					
	}

}

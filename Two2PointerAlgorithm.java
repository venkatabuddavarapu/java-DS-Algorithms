package com;

import java.util.Collections;
import java.util.List;

public class Two2PointerAlgorithm {
	
	

	public static void main(String[] args) {
		
		int[] arr = {1,3,4,9,7};
		int sum = 7;
				
		//bruteforce approach
		//Time complexity: O(n^2), since for every element we are traversing the whole array and there are n elements in the array.
		//Space complexity: O(1).
		twosum_brute(arr, sum, arr.length);
		
		
		
		//Since we considered the array is sorted, the time complexity is reduced to O(n) and the space complexity reduces to O(1) unlike hashing where we were using maps and hashmaps to store elements and compare them.
		twosum_pointer(arr, sum);
		
	}
	
	
	static void twosum_brute(int arr[], int sum, int sizeArr) {
		  for (int i = 0; i < sizeArr; i++) {
		    for (int j = i; j < sizeArr; j++) {
		      if (arr[i] + arr[j] == sum) {
		        System.out.println(arr[i] + " " + arr[j]);
		        return;
		      }
		    }
		  }
		  System.out.println("-1 -1");
	}
	
	
	static void twosum_pointer(int arr[], int sum) {
		int low = 0;
		int high = arr.length-1;
		
		while(low<high) {
			if(arr[low]+arr[high]==sum) {
				System.out.println(arr[low]+ "  "+arr[high]);
				break;
			}else if(arr[low]+arr[high] < sum) {
				low++;
			}else {
				high--;
			}
			
		}
		
	}
	
	
	

}

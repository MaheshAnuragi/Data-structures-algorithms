import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long maxSum = arr[0];
		long sum = arr[0];
		for(int i=1;i<arr.length;i++){
			sum+=arr[i];
			if(sum<0) sum = 0;
			maxSum = Math.max(sum, maxSum);
		}
		return maxSum;
	}

}


// it's consider also negative as maximum
// public static long maxSubarraySum(int[] arr, int n) {
// 		// write your code here
// 		long maxSum = arr[0];
// 		long sum = arr[0];
// 		for(int i=1;i<arr.length;i++){
// 			sum = Math.max(sum+arr[i], arr[i]);
// 			maxSum = Math.max(sum, maxSum);
// 		}
// 		return maxSum;
// 	}


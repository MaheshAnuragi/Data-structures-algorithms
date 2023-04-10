import java.util.* ;
import java.io.*; 
public class Solution {

	public static long maxSubSumKConcat(ArrayList<Integer> arr, int n, int k) {
		// Write your code here.
		ArrayList<Integer> res = new ArrayList<>();
		for(int i=0;i<k;i++){
			res.addAll(arr);
		}

		// System.out.println(res);

		long maxSum = Long.MIN_VALUE;
		long currSum = 0;

		for(int i=0;i<res.size();i++){
			if(currSum<0) currSum=0;
			currSum+=res.get(i);
			maxSum=Math.max(maxSum, currSum);
		}

		return maxSum;	// T:O(n) S: O(n) 



		// long maxSum = Long.MIN_VALUE;
		// long currSum = 0;

		// for(int i=0;i<arr.size()*k;i++){
		// 	if(currSum<0) currSum=0;
		// 	currSum+=arr.get(i%n);
		// 	maxSum=Math.max(maxSum, currSum);
		// }

		// return maxSum;	// T:O(n*k) S: O(1) 

		
	}
}
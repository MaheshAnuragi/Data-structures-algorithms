import java.util.* ;
import java.io.*; 
public class Solution {
	public static int flipBits(int[] arr,int n) {
        //Write your code here

		// First of all we counts the all ones
		// then we replace the 0 to +1 and 1 to -1
		// then we apply Kadane's Algo
		// after that we got the Max. Sum
		// then we add the Max.Sum + prev. count

		// it will return

		int prevCount = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==1){
				prevCount++;
				arr[i]=-1;
			}else{
				arr[i]=+1;
			}
		}

		int maxSum = 0;
		int curSum = arr[0];

		for(int i=1;i<arr.length;i++){
			curSum = Math.max(arr[i]+curSum,arr[i]);
			maxSum = Math.max(curSum,maxSum);
		}

		return maxSum + prevCount;




	}
}

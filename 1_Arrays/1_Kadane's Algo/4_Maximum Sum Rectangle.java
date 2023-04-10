import java.util.* ;
import java.io.*; 
public class Solution
{
    public static int maxSumRectangle(int[][] arr, int n, int m){
        // Write your code here.

        // https://www.youtube.com/watch?v=mKluyW4YFvs&ab_channel=AnujBhaiya

        // first of all we take 1st Coloumn and copy thats all element
        //  in Col array
        // then take a maxSum using Kadane's Algo
        // then in that Col sum that next col.
        //  same kadane's algo
        // till Last col
        // then we find max sum rectangle sum
        
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<m;i++){
            int[] Col = new int[n];
            
            for(int k=i;k<m;k++){
                for(int j=0;j<n;j++){
                    Col[j]+=arr[j][k];
                }
                // for(int p=0;p<n;p++){
                //     System.out.print(Col[p]+" ");
                // }
                // System.out.println();
                int sum = maxSumKad(Col);
                // System.out.println("sum : "+sum);
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }

    public static int maxSumKad(int[] Col){
        
        int maxSumm = Integer.MIN_VALUE;
        int curSum = 0;

        for(int i=0;i<Col.length;i++){
            if(curSum<0) curSum=0;
            curSum+=Col[i];
            maxSumm = Math.max(curSum, maxSumm);
        }

        return maxSumm;
    }


}

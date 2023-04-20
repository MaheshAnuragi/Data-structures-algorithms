import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        int mid = 0;
        int low = 0;
        int high = arr.length-1;

        while(mid<=high){
            if(arr[mid]==0){
                int let = arr[mid];
                arr[mid] = arr[low];
                arr[low] = let;
                mid++;
                low++;
            }else if(arr[mid]==1){
                mid++;
            }else if(arr[mid]==2){
                int let = arr[mid];
                arr[mid] = arr[high];
                arr[high] = let;
                high--;
            }
        }
        
    }
}
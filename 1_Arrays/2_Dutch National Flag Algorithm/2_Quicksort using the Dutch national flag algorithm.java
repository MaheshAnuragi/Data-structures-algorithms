import java.util.* ;

public class Solution {
    public static ArrayList<Integer> quickSortUsingDutchNationalFlag(ArrayList<Integer> arr) {
        // Write your code here.
        quickSort(arr, 0, arr.size()-1);

        return arr;
    }
    public static void quickSort(ArrayList<Integer> arr , int low , int high){

        if(low<high){

            int pivot = partition(arr,low,high);

            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }

    }

    public static int partition(ArrayList<Integer> arr, int low, int high){
        
        // https://youtu.be/QXum8HQd_l4

        int mid = low;
        int start = low;
        int end = high;
        int pivot = arr.get(high);

        while(mid<=end){
            if(arr.get(mid)<pivot){
                Collections.swap(arr, mid, start);
                mid++;
                start++;
            }else if(arr.get(mid)==pivot){
                mid++;
            }else{
                Collections.swap(arr, mid, end);
                end--;
            }
        }

        return start;
    }
}
package array;

import java.util.Arrays;

public class MinimizeTheMaximunDifference {
	
	public static void main(String[] args) {
		int arr[] = {2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
		int k =5;
		
		System.out.println(minimizeTheMaximumDifference(arr, k));
	}

	private static int minimizeTheMaximumDifference(int[] arr, int k) {
//		System.out.println("helol");
		int n = arr.length;
		Arrays.sort(arr);
//		for(int i = 0 ; i  < n; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
        
	       int minEle = arr[0];
	       int maxEle = arr[n-1];
	       int result = arr[n-1] - arr[0];
	        
	        for(int i = 1 ; i < arr.length; i++){
	           if(arr[i] >= k){
	               
	               minEle = Math.min(arr[0]+k,arr[i] - k);
	               maxEle = Math.max(arr[n-1]-k, arr[i-1] + k);
	               
	               result = Math.min(result, maxEle - minEle);
	           }
	        }
	        
	        return result;
    }

}

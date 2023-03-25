package array;

import java.util.Arrays;

public class MergeTwoSortedArray {
	public static void main(String[] args) {
		int arr1[] = {1,5,9,10,15,20};
		int arr2[] = {2,3,8,13};
		
		mergetwoSortedArray(arr1, arr2);
		print(arr1, arr2);
		System.out.println();
		
		mergeTwoSortedArray2(arr1, arr2);
		print(arr1, arr2);
		System.out.println();
		
		mergeTwoSortedArray3(arr1, arr2);
		print(arr1, arr2);
	}

	private static void mergeTwoSortedArray3(int[] arr1, int[] arr2) {
		
		int n = arr1.length;
		int m = arr2.length;
		
		int i = 0;
		int j = 0;
		
		while(i < n) {
			if(arr1[i] < arr2[j]) {
				i++;
			}else {
//				swap(arr1[i], arr2[j]);
				int temp = arr1[i];
				arr1[i] = arr2[j];
				arr2[j] = temp;
				i++;
				Arrays.sort(arr2);
			}
		}
		
	}

	private static void mergeTwoSortedArray2(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		int i = 0;
		int j = 0;
		int k = n-1;
		
		while(i <= k && j < m) {
			
			if(arr1[i] < arr2[j]) {
				i++;
			}else {
//				swap(arr1[k], arr2[j]);
				int temp = arr1[k];
				arr1[k] = arr2[j];
				arr2[j] = temp;
				k--;
				j++;
			}
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		
	}

	

	private static void mergetwoSortedArray(int[] arr1, int[] arr2) {
		
		int n = arr1.length;
		int m = arr2.length;
		
		for(int j = m-1; j >=0; j--) {						
			
			int last = arr1[n-1];
			int i;
			for(i = n-2; i>=0 && arr1[i] > arr2[j]; i--) {
				arr1[i+1] = arr1[i];
			}
			
			if(last > arr2[j]) {
				arr1[i+1] = arr2[j];
				arr2[j] = last;
				
			}
		}
		
	}
	
	private static void print(int[] arr1, int[] arr2) {
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		
		for(int j = 0 ; j < arr2.length; j++) {
			System.out.print(arr2[j]+" ");
		}
		
	}

}

package sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[] = {2,1,19,3,34,11,90,54};
		
		sort(arr);
		for(int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void sort(int[] arr) {
		
		int n = arr.length;
		
		for(int i = 1; i < n; i++) {
			int j = i-1;
			int curr = arr[i];
			while(j>=0 && arr[j] > curr) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = curr;
			
		}
	}

}

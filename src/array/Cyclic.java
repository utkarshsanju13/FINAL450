package array;

public class Cyclic {
		public static void main(String[] args) {
		 int arr[] = {1,2,3,4,5,6,7,8,9};
		 int n = 2; 
		 rotateByNTimes(arr,n);
	}

	private static void rotateByNTimes(int[] arr, int n) {
		
		int len = arr.length;
		
//		reverse(0,len-n-1,arr);
//		reverse(len-n,len-1,arr);
		reverse(0,len-1,arr);
	}

	private static void reverse(int i, int j, int[] arr) {
		
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
		for(int g = 0 ; g < arr.length; g++) {
			System.out.print(arr[g]+" ");
		}
		System.out.println();
		
		
	}

}
//
//1234567|89    891234567
//
//7654321|98 = 891234567

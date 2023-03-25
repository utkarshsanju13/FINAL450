//5: Two pointer method
//Note: Order of elements is not important here.

package array;

public class AllNegativeOneSide2 {
	
	public static void allNegativeOneSide2(int [] arr) {
	
		int start = 0;
		int end = arr.length -1;
		
		while(start <= end) {
			if(arr[end] < 0 && arr[start] < 0) {
				start++;
			} else if(arr[start] > 0 && arr[end] < 0) {
				swap(arr,start, end);
				start++;
				end--;
			} else if(arr[start] > 0 && arr[end] > 0 ) {
				end--;
			}else {
				start++;
				end--;
			}
		}
	}
	
	public static void swap(int [] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		allNegativeOneSide2(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
}

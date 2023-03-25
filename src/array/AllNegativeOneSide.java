//5
//Note: Order of elements is not important here.
package array;

public class AllNegativeOneSide {
	
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void allNegativeOneSide(int arr[]) {
		
		int i = -1;
		for(int j = 0; j < arr.length; j++) {
			
			if(arr[j] < 0) {
				i++;
				swap(arr, i, j);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		allNegativeOneSide(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
			
	}

}

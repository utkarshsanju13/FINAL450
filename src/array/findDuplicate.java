package array;

public class findDuplicate {
	public static void main(String[] args) {
		int arr[] = {1, 3, 4, 2, 2};
		System.out.println(findDuplicate(arr));
	}

	private static int findDuplicate(int[] arr) {
		int arrSum = 0;
        int originalSum = 0;
        for(int i = 1; i <= arr.length-1; i++){
            originalSum = originalSum + i;
        }
        
        for(int i = 0 ; i < arr.length; i++){
            arrSum = arrSum+arr[i];
        }
        
        return arrSum - originalSum;
	}
}

package array;

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 3, 4, 2, 2};
		System.out.println(Test(arr));
		
	}

	private static int Test(int[] arr) {
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

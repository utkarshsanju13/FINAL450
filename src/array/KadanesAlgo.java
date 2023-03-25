package array;

public class KadanesAlgo {
	public static void main(String[] args) {
		int arr[] = {-1,-2,-3,-4};
		
		System.out.println(maxSubarray(arr));
	}

	private static int maxSubarray(int[] arr) {
		
		int max_so_far = Integer.MIN_VALUE;
		int max = 0;
		int start = 0;
		int end = 0;
		
		for(int i = 0 ; i < arr.length; i++) {
			max = max + arr[i];
			
			if(max_so_far < max) {
				end = i;
				max_so_far = max;
			}
			
			if(max < 0) {
				start = i+1;
				max = 0;
			}
		}
		System.out.println("Start = "+ start + " end = "+ end);
		return max_so_far;
		
	}

}

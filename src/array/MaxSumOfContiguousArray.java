package array;

public class MaxSumOfContiguousArray {
	
	public static void main(String[] args) {
		 int arr[] = {-1,-2,-3,-4};
		  System.out.println(MaxSum(arr));
	}

	private static int MaxSum(int[] arr) {
		
		int max_so_far = Integer.MIN_VALUE;
		int max_ending_here = 0;
		int s = 0, e =0;
		
		for(int i = 0 ;i < arr.length; i++) {
			
			max_ending_here = max_ending_here + arr[i];
			
			
			if(max_so_far < max_ending_here) {
				e = i;
				max_so_far = max_ending_here;
			}
			
			if(max_ending_here < 0) {
				s=i+1;
				max_ending_here = 0;
			}
		}
		System.out.println("start = "+ s + " end = "+ e); 
		
		
		
		return max_so_far;
	}

}

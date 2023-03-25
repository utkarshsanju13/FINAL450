package array;

public class MinimumNoOfJump_N_Complexity {
	
	public static void main(String[] args) {
		
		int arr[] = {1, 3, 5, 9, 6, 2, 6, 7, 6, 8, 9};
		int n = arr.length;
		
		System.out.println("Number of jump : "+ minimumJump(arr, n));
	}

	private static int minimumJump(int[] arr, int n) {
		
		if(arr[0] == 0)
			return -1;
		
		if(arr.length <= 1) {
			return 0;
		}
		
		
		
		int maxReach = arr[0];
		int step = arr[0];
		int jump = 1;
		
		for(int i = 1; i < n; i++) {
			
			if(i == n-1) {
				return jump;
			}
			
			maxReach = Math.max(maxReach, i + arr[i]);
			
			step--;
			
			if(step == 0) {
				jump++;
			
				if(i >= maxReach) {
					return -1;
				}
				
				step = maxReach - i;
			}
		}
		
		return -1;
		
	}
	
}

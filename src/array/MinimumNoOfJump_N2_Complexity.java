package array;

public class MinimumNoOfJump_N2_Complexity {
	
	public static void main(String[] args) {
		int arr[] = {2,1,0,3};
		
//		System.out.println("ans"+ MinimumJump(arr));
		System.out.println(MinimumJumpPrep(arr));
	}

	private static int  MinimumJumpPrep(int[] arr) {
		
		int n = arr.length;
		int dp[] = new int[n];
		dp[arr.length-1] = 0;
		
		for(int i = arr.length - 2; i>=0; i--) {
			int steps = arr[i];
			
			int min = Integer.MAX_VALUE;
			for(int j =1; j <= steps && i+j < arr.length; j++) {
				if(dp[i+j] < min && dp[i+j] != 0) {
					min = dp[i+j];
				}
			}
			
			if(min != Integer.MAX_VALUE) {
				dp[i] = min +1;
			}
			
		}
		
		for(int i = 0 ; i < dp.length; i++) {
			System.out.print(dp[i]+" ");
		}
		System.out.println();
		return dp[0];
		
	}
	
	private static int  MinimumJump(int[] arr) { // Basically this solution is filling dp from start to end 
		///GFG SOLUTION
		int n = arr.length;
		int jump[] = new int[n];
		
		for(int i = 1; i < n; i++) {
			
			jump[i] = Integer.MAX_VALUE;
			for(int j = 0; j < i; j++) {
				
				if(i <= j+arr[j]) {
					jump[i] = Math.min(jump[i], jump[j]+1);
					break;
				}
				
			}
			if(jump[i] == Integer.MAX_VALUE) {
				jump[i] = -1;
			}
		}
		
		return jump[n-1];
		
		
	}
}

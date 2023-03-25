package array;

public class MergeIntervals {
	public static void main(String[] args) {
		int arr[][] = {{1,3},{2,6},{8,10},{15,18}};
		
		mergeTheOverlappingArray(arr); // output must be: {{1,6},{8,10},{15,18}};
	}

	private static void mergeTheOverlappingArray(int[][] arr) {
		int result[][] = new int[arr.length][arr[0].length];
		result[0][0] = arr[0][0];
		for(int i = 0 ; i< arr.length-1; i++) {
				int temp = arr[i][1];
				if(temp > arr[i+1][0]) {
					result[i][1] = arr[i+1][1];
					i++;
				}
				else {
					result[i][1] = temp;
				}
				
		}
		
		for(int i = 0 ; i < result.length; i++) {
			for(int j = 0 ; j < result[0].length; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	
	}
}

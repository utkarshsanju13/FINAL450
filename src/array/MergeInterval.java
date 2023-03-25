package array;

public class MergeInterval {
	public static void main(String[] args) {
		int [][] arr = {{1,3},{2,6},{8,10},{15,18}};
//		int [][] arr = {{1,4},{4,5}};
		int [][] result = merge(arr);
		print(result);
		
	}

	private static int[][] merge(int[][] intervals) {
		 int n = intervals.length;
	        int m = intervals[0].length;
	        int result[][] = new int[n][m];
	        int k = 0;
	    
	        int prev_start = intervals[0][0];
	        int prev_end = intervals[0][1];
	        for(int i = 1 ; i < n; i++){
	            int start = intervals[i][0];
	            int end = intervals[i][1];
	            
	            if(prev_end < intervals[i][0]){   // comparing the end of an interval and the start of next intervals
	                result[k][0] = intervals[i][0];		// if the end is small then no overlapping 
	                result[k][1] = intervals[i][1];
	                
	               
	            }
	            
	            if(prev_end >= intervals[i][0]){
	                result[k][0] = prev_start;
	                result[k][1] = intervals[i][1];
	               
	            }
	            prev_start = result[k][0];
                prev_end = result[k][1];
                k++;
	            
	        }
	        
	        return result;
	        
		
	}

	private static void print(int[][] result) {
		
		for(int i = 0 ; i < result.length; i++) {
			for(int j = 0 ; j < result[0].length; j++) {
				System.out.print(result[i][j]+" 	");
			}
			System.out.println();
		}
		
	}
}

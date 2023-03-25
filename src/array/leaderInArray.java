package array;

/*Given an integer array A of size n. Find and print all the leaders
present in the input array. An array element A[i] is called Leader, 
if all the elements following it (i.e. present at its right) are less 
than or equal to A[i].
Print all the leader elements separated by space and in the same order
they are present in the input array.
*/

public class leaderInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 3, 12, 34, 2, 0, -1};
		
		leaders(arr);
	}
	
	public static void leaders(int[] arr) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
		if(arr.length <= 0)
            return ;
        
        int n = arr.length;
       	int max = arr[n-1];    
        String result = String.valueOf(max) + "";
        for(int i = n-2 ; i >= 0; i--){
            
            if(arr[i] >= max){
            
                result = String.valueOf(arr[i])+ " "+ result;
                max = arr[i];
            }
        }
        
        System.out.println(result);

    }


}

//6:if the elements in the array are duplicate
package array;

public class UnionIntersectionWithoutDuplicacy {
	
	public static int union(int [] arr1, int arr2[]) {
		int m = arr1[arr1.length - 1];
		int n = arr2[arr2.length - 1];
		int count = 0;
		int ans;
		
		if(m > n)
			ans = m;
		else
			ans = n;
		
		int newArray[] = new int[ans+1];
//		System.out.print(arr1[0]);
		newArray[arr1[0]]++;
		for(int i = 1; i < arr1.length; i++) {
			if(arr1[i] != arr1[i-1]) {
				++newArray[arr1[i]];
				count++;
			}
		}
		
		for(int j = 0 ; j < arr2.length; j++) {
			if(newArray[arr2[j]] == 0) {
//				System.out.print(arr2[j]+" ");
				++newArray[arr2[j]];
				count++;
			}
		}
		
		for(int i = 0; i < newArray.length; i++) {
			if(newArray[i] != 0) {
				System.out.print(i + " " );
			}
		}
		
		return count;
	}

	
	
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5,5,6,6,6,7,7,};
		int arr2[] = {3,3,5,5,6,6,6,8,9,9,10,10,11};
		
		System.out.println(union(arr1, arr2));

	}

}

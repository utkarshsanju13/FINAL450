//6 : But if the array has duplicate elements it will also be printing the element
// Check UnionIntersectionWithoutDuplicacy
package array;

public class UnionAndIntersection {
	
	public static int Union(int [] arr1, int arr2[]) {
		int i = 0;
		int j = 0;
		int count = 0;
		
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				System.out.print(arr1[i]+" ");
				count++;
				i++;
			}else if(arr1[i] > arr2[j]) {
				System.out.print(arr2[j]+" ");
				count++;
				j++;
			}else {
				System.out.print(arr1[i]+" ");
				count++;
				i++;
				j++;
			}
		}
		
		while(i < arr1.length) {
			System.out.print(arr1[i++]+" ");
			count++;
		}
		
		while(j < arr2.length) {
			System.out.print(arr2[j++]+" ");
			count++;
		}
		
		return count;
	}
	
	public static int Intersection(int [] arr1, int arr2[]) {
		
		int i = 0; 
		int j = 0;
		int count = 0;
		while(i < arr1.length && j < arr2.length) {
			
			if(arr1[i] < arr2[j]) {
				i++;
			}else if(arr1[i] > arr2[j]) {
				j++;
			}
			
			else {
				System.out.print(arr1[i]+" ");
				i++;
				j++;
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,7,8};
		int arr2[] = {3,4,5,6};
		
		int countUnion = Union(arr1, arr2);
		System.out.println();
		System.out.println("count of Union Elements " + countUnion);
		int countIntersection = Intersection(arr1, arr2);
		System.out.println();
		System.out.println("Count of Intersection Element " + countIntersection);
		
	}

}

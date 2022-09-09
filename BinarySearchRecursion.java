package search;

public class BinarySearchRecursion {
	
	public static void findRecursiverly(int arr[], int start, int end, int search) {
		if(start>end) {
			return;
		}
		int mid = (start+ end)/2;
		if(arr[mid] == search) {
			System.out.println(mid);
			return;
		}
		else if(search > arr[mid]) {
			findRecursively(arr, mid+1, end, search);
			
		}
		else {
			findRecursively(arr, start, mid - 1, search);
		}
	}
	public static void main(String[] agrs)
	{
		int arr[] = {10,12,14,15,16,20};
		int search = 15;
		
		int start = 0;
		int end = arr.length-1;
		
		findRecursively(arr, start, end, search);
	}
	private static void findRecursively(int[] arr, int start, int end, int search) {
		// TODO Auto-generated method stub
		
	}
}

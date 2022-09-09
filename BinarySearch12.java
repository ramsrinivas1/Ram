package search;

public class BinarySearch12 {
	
	private static int key;
	public static int binarySearchWithoutRecursion(int[] arr, int key)
	{
		// if(arr[arr.length-1]<key)||(arr[0]>key))
		// return-1;
		
		int first = 0;
		int last = arr.length-1;
		int mid = last/2;
		
		// 1 2 3 4
		// 5 6 7 8
		// 6
		
		while(first <= last)
		{
			if(arr[mid]<key) {
				first = mid + 1;
			}
			else if(arr[mid] == key)
			{
				return mid;
			}
			else {
				last = mid-1;
			}
			mid = (first+last)/2;
		}
		return -1;
	}




public static int binarySearchWithoutRecursion(int[] arr, int key, int first, int last)
{
	if(last>=first)
	{
		int mid=(first+last)/2;
		if(arr[mid]<key)
		{
			first = mid + 1;
			return binarySearchWithoutRecursion(arr,key,first,last);
		}
		else if(arr[mid] == key)
		{
			return mid;
		}
		else {
			last = mid-1;
			return binarySearchWithoutRecursion(arr,key,first,last);
		}
	}
	
	return -1;
	
}
public static void main(String[] agrs)
{

	System.out.println("Index of my search element: "+binarySearchWithoutRecursion(new int[] {1,2,3,8,9},key+ 70));
	System.out.println("Index of my search element: "+binarySearchWithoutRecursion(new int[] {1,2,3,8,9},key+ 70, key+ 0, key+ 4));
	System.out.println("Index of my search element: "+binarySearchWithoutRecursion(new int[] {1,2,3,8,9},key+ 8, key+0, key+4));
	
		}
		}
	
package sortingAlgs;


/*Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
Java  // https://www.geeksforgeeks.org/java-program-for-bubble-sort/
// https://www.javatpoint.com/bubble-sort-in-java
 */
// Java program for implementation of Bubble Sort
public class BubbleSort
{
	public static void bubbleSort(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n-1; i++)
			for (int j = 0; j < n-i-1; j++)
				if (arr[j] > arr[j+1])
				{
					// swap temp and arr[i]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
	}


	// Driver method to test above
	public static void main(String args[])
	{
		int arr[] = {64, 34, 25, 12, 22, 11, 90};

		System.out.println("Unsorted array");
		/* Prints the array */
		for (int i=0; i<arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		

		bubbleSort(arr);
		System.out.println("Sorted array");
		/* Prints the array */

		for (int i=0; i<arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
	}

}
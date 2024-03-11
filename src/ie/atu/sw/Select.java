package ie.atu.sw;

public class Select {
	
	/*
	 * Selection sort method. Code from https://www.geeksforgeeks.org/selection-sort/(13). Creates 2 arrays and iterates over the unsorted array.
	 * The code moves minimum element from unsorted to sorted array.
	 * The arrays are increased and decreased by 1 respectively. 
	 */
	 public static void selectionSort(int[] arr) {
	        for (int i = 0; i < arr.length - 1; i++) {
	            int index = i;
	            //determining the index with lower value
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[j] < arr[index]) {
	                    index = j;
	                }
	            }
	            //Returning the sorted array.
	            int small = arr[index];
	            arr[index] = arr[i];
	            arr[i] = small;
	        }
	    }

}

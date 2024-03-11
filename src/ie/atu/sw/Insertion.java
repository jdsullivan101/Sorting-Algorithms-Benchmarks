package ie.atu.sw;

public class Insertion {
	
	/*
	  * Insertion Sort method. Code adapted from https://www.javatpoint.com/insertion-sort(12). Original array is modified,
	  * and no 2nd array is created. Copies the value into a temp int (key) and compares this value to 
	  * the next element. Depending on the result, the elements are shifted left or right, and the key is 
	  * then inserted into correct position.
	  */
	 
	 public static void insertionSort(int[] arr) {
	        for (int i = 1; i < arr.length; i++) {
	        	//Declaring the key of the array. Assuming the element at index 0 is sorted. 
	            int key = arr[i];
	            int j = i - 1;
	            while ((j >= 0) && (arr[j] > key)) {
	                arr[j + 1] = arr[j];
	                j--;
	            }
	            arr[j + 1] = key;
	        }
	    }

}

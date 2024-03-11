package ie.atu.sw;

public class Count {
	
	 /*
	  * Counting sort method. Method needs to find largest element in arr, max.
	  * https://www.programiz.com/dsa/counting-sort (6), see report
	  */
	 
	 public static void countSort(int[] arr) {
		 int x = arr.length;
		 //declare max value at index 0, and then finding the max value in arra
		 int max = arr[0];
		 for(int i = 1; i < x; i++) {
			 if(arr[i] > max) {
			 max = arr[i];
			 }
		 }
		 
		 //Creating new output arrays.
		 int[] sortedarr = new int[x + 1];
		 //count array will have an index of max value plus 1
		 int[] count = new int[1 + max];
		 
		 //Initialise count array to 0
		 for(int i =0; i <= max; ++i) {
			 count[i] = 0;
		 }
		 
		 //Storing count of the array.
		 for(int i = 0; i < x; i++) {
			 count[arr[i]]++;
		 }
		 
		 //The count of each array.
		 for(int i = 1; i <= max; i++) {
			 count[i] += count[i - 1];
			 }
		 
		 //Index search of the elements in original array in count array.
		 for(int i = (x - 1); i >= 0; i--) {
			 sortedarr[count[arr[i]] - 1] = arr[i];
			 count[arr[i]]--;
		 } 
		 
		 //Getting the sorted array.
		 for(int i = 0; i < x; i++) {
			 arr[i] = sortedarr[i];
		 }
		 
	}

}

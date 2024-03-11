package ie.atu.sw;

import java.util.Arrays;

public class Merge {
	
	 /*
	  * https://www.geeksforgeeks.org/merge-sort/ (5)
	  * The merge sort method takes the input arr and splits it in 2, left arr and right arr.
	  * This also recursively checks the arr input by calling the mergeSort on the arr. The arr
	  * is split in 2 until arr has only 1 element, which then allows for sorting.
	  * 
	  */
	 
	 public static void mergeSort(int[] arr) {
		    
		 //Splitting the array until there is only 1 element in each array.
		 if (arr.length > 1) {
		        int mid = arr.length / 2;
		        int[] leftArr = Arrays.copyOfRange(arr, 0, mid);
		        int[] rightArr = Arrays.copyOfRange(arr, mid, arr.length);
		        mergeSort(leftArr);
		        mergeSort(rightArr);
		    
		/*
		 * These ints, represent leftarr, rightarr and k refers to the merged or sorted arr.
		 * The while loops are comparing the values of the elements in each array. 
		 */
		    int i = 0, j = 0, k = 0;
		    while (i < leftArr.length && j < rightArr.length) {
		    	//finding the larger element, the <= allows for the stable sorting
		        if (leftArr[i] <= rightArr[j]) {
		            arr[k++] = leftArr[i++];
		        } else {
		            arr[k++] = rightArr[j++];
		        }
		    }
		    while (i < leftArr.length) {
		        arr[k++] = leftArr[i++];
		    }
		    while (j < rightArr.length) {
		        arr[k++] = rightArr[j++];
		    }
		}
	 }

}

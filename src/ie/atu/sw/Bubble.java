package ie.atu.sw;

public class Bubble {
	
	/*Bubble sort Method. This is the enhanced bubble sort array that uses boolean values to determine
	 * if the elements are swapped. By doing this execution time of the method is reduced by lowering 
	 * the number of iterations required. Code from lecture notes.
	 */
	public static void bubbleSort(int[] arr) {
		
		//Declaring the boolean value for the algorithm
        boolean swapped;
        do {
        	//Algorithm will loop while boolean is true, if no swapping occurs the method will terminate. 
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

}

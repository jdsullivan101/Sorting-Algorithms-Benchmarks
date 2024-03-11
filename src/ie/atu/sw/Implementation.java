package ie.atu.sw;

public class Implementation {
	
	public static void main(String[] args) {

		// Defining the input sizes of the Arrays.

		int[] sizeArray = { 100, 250, 500, 750, 1000, 1250, 2500, 3750, 5000, 6250, 7500, 8750, 10000};
		System.out.printf(("%-20s%-20s%-20s%-20s%-20s%-20s\n"), "Size", "Bubble", "Selection", "Insertion", "Merge",
				"Count");
		for (int n : sizeArray) {

			// Declaring variable type.

			double bubbleduration = 0;
			double selectionduration = 0;
			double insertionduration = 0;
			double mergeduration = 0;
			double countduration = 0;

			// Creating the loop to iterate 10 times.
			for (int i = 0; i <= 10; i++) {

				// calling the randomArray from Bench.
				int[] arr = Random.randomArray(n);
				double startTime;
				double endTime;

				/*
				 * Calling the methods for each of the algorithms. Each one has their own start
				 * and end time to ensure correct calculation.
				 */
				startTime = System.nanoTime();
				Bubble.bubbleSort(arr.clone());
				endTime = System.nanoTime();
				bubbleduration += ((endTime - startTime) / 1000000.0);

				startTime = System.nanoTime();
				Select.selectionSort(arr.clone());
				endTime = System.nanoTime();
				selectionduration += ((endTime - startTime) / 1000000.0);

				startTime = System.nanoTime();
				Insertion.insertionSort(arr.clone());
				endTime = System.nanoTime();
				insertionduration += ((endTime - startTime) / 1000000.0);

				startTime = System.nanoTime();
				Merge.mergeSort(arr.clone());
				endTime = System.nanoTime();
				mergeduration += ((endTime - startTime) / 1000000.0);

				startTime = System.nanoTime();
				Count.countSort(arr.clone());
				endTime = System.nanoTime();
				countduration += ((endTime - startTime) / 1000000.0);

			}

			// Declaring variables for the duration times.

			double avgbubbleduration = (bubbleduration / 10);
			double avgselectionduration = (selectionduration / 10);
			double avginsertionduration = (insertionduration / 10);
			double avgmergeduration = (mergeduration / 10);
			double avgcountduration = (countduration / 10);

			System.out.printf(("%-20d%-20.3f%-20.3f%-20.3f%-20.3f%-20.3f\n"), n, avgbubbleduration,
					avgselectionduration, avginsertionduration, avgmergeduration, avgcountduration);
		}
	}

}

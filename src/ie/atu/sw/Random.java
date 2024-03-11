package ie.atu.sw;

import java.util.concurrent.ThreadLocalRandom;

public class Random {
	
	//Generating the random array, int n is called in the main function for array size. 
		public static int[] randomArray(int n) {
			int[] arr = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i] = ThreadLocalRandom.current().nextInt(0, 10001);
			}
			return arr;
		}

}

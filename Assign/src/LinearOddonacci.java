import java.io.FileWriter;
import java.io.IOException;

public class LinearOddonacci {

	private static int nbCalls;

	public static long[] linearOd(int x) {

		nbCalls++; // counter

		long[] A = new long[3];
		long i = 1, j = 1, k = 1;

		if (x <= 3) { // by the time the recursion returns to value three the array looks like this:
						// A = {1, 1, 1} which demonstrates the first three constant values of 1
			A[0] = i;
			A[1] = j;
			A[2] = k;
			return A; // returns A = {1, 1, 1}
		} else {
			A = linearOd(x - 1); // calls back the method to give the array value of the previous time
									// it was called
			i = A[0];
			j = A[1];
			k = A[2];

			A[0] = i + j + k; // change the first value in the array for the Oddonacci value at x
			A[1] = i; // change the second value in the array (j value) for the i value at x
			A[2] = j; // change the third value in the array (k value) for the j value at x

			return A; // returns A = {i+j+k, i, j}
		}
	}

	public static void main(String[] args) throws IOException {

		try {
			FileWriter fw = new FileWriter("/C:/COMP352/Assign/src/OddoLinearOut.txt");
			fw.write("This is the file for the Linear Oddonacci in increments of 5 until 100: \n");
			for (int i = 1; i <= 20; i++) {
				long start = System.nanoTime(); // start of time measurement
				fw.write("Oddonacci(" + (i * 5) + ") = " + linearOd(i * 5)[0] + "\n"); // method function
				long end = System.nanoTime(); // end of time measurement
				fw.write("Time measurements: " + (end - start) + " nanoseconds.\n\n"); // total time measurement
			}
			fw.write("Number of calls: " + nbCalls); // the number of method calls
			fw.close();
		} catch (Exception e) {
			System.out.println("There was an error, please try again!");
		}
	}
}

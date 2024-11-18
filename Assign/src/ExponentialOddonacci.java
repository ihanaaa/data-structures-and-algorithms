import java.io.FileWriter;
import java.io.IOException;

public class ExponentialOddonacci {

	private static int nbCalls;

	public static long exponentialOd(int x) {

		nbCalls++; // counter

		if (x <= 3) {
			return 1; // the first three values equate to 1
		}

		else {
			return (exponentialOd(x - 1) + exponentialOd(x - 2) + exponentialOd(x - 3)); // recursion
		}
	}

	public static void main(String[] args) throws IOException {
		try {
			FileWriter fw = new FileWriter("/C:/COMP352/Assign/src/OddoExponentialOut.txt");
			fw.write("This is the file for the Exponential Oddonacci in increments of 5 until 100: \n");
			for (int i = 1; i <= 6; i++) { // doing it until 100 does not print since it takes too long

				long start = System.nanoTime(); // start of time measurement
				fw.write("Oddonacci(" + (i * 5) + ") = " + exponentialOd(i * 5) + "\n");
				long end = System.nanoTime(); // end of time measurement
				fw.write("Time measurements: " + (end - start) + " nanoseconds.\n\n"); // total time measurement

			}
			fw.write("The number of calls: " + nbCalls); // number of calls
			fw.close();
		} catch (Exception e) {
			System.out.println("There was an error, please try again!");
		}

	}
}

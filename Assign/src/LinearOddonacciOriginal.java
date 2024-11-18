import java.util.Scanner;

public class LinearOddonacciOriginal {

	private static int nbCalls;

	public static long[] linearOddonacci(int x) {

		nbCalls++;

		long[] A = new long[4];
		long i = 1;
		long j = 1;
		long k = 1;

		if (x == 0) {
			System.out.println("Oddonacci(0) = 0");
			System.exit(0);
		}

		if (x != 1)
			A = linearOddonacci(x - 1);

		if (x == 1) {
			i = 1;
			j = 0;
			k = 0;
			A[0] = i;
			A[1] = j;
			A[2] = k;

			System.out.println("Oddonacci(1) = 1");
			return A;
		}

		else if (x == 2) {
			i = 1;
			j = 1;
			k = 0;
			A[0] = i;
			A[1] = j;
			A[2] = k;
			System.out.println("Oddonacci(2) = 1");
			return A;
		}

		else if (x == 3) {
			i = 1;
			j = 1;
			k = 1;
			A[0] = i;
			A[1] = j;
			A[2] = k;
			System.out.println("Oddonacci(3) = 1");
			return A;
		}

		i = A[0];
		j = A[1];
		k = A[2]; // reinitialize to value of A

		if (x != 4) {
			A[0] = j;
			A[1] = k;
			A[2] = A[3];
		}

		A[3] = A[0] + A[1] + A[2];
		System.out.println("Oddonacci(" + x + ") = " + A[3]);
		return A;

	}

	public static void main(String[] args) {

		int value = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a non-negative value: ");
		value = scan.nextInt();
		while (value < 0) {
			System.out.print("This value is negative, please enter a non-negatie value: ");
			value = scan.nextInt();
		}

		linearOddonacci(value);
		System.out.println("Number of calls: " + nbCalls);
		scan.close();
	}
}

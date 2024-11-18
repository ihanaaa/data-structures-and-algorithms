
public class ppArray {

	public static void main(String[] args) {

		int[] X = { 10, 16, 4, 18, 7, 23, 27, 39 };
		int[] A = new int[X.length];
		int s = 0;
		for (int i = 0; i < X.length; i++) {

			if (i == 0) {
				A[i] = X[i];
				s = X[i];
			}

			else {
				s += X[i];
				A[i] = (s / (i + 1));
			}

			System.out.print(A[i] + " ");

		}

	}

}

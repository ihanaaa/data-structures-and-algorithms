
public class arrayMixer {

	private int x;
	private int sum;

	public arrayMixer() {
		x = 0;
		sum = 0;

	}

	public arrayMixer(int x, int sum) {
		this.x = x;
		this.sum = sum;

	}

	public arrayMixer(arrayMixer aM) {
		this.x = aM.x;
		this.sum = aM.sum;
	}

	public void setX(int y) {
		this.x = y;
	}

	public int getX() {
		return this.x;
	}

	public void setSum(int s) {
		this.sum = s;
	}

	public int getSum() {
		return this.sum;
	}

	public void mix(int[] X) {
		int x = X.length / 2;
		System.out.print("First part: ");

		int temp[] = new int[2];
		for (int i = 0; i < x; i++) {

			if (i % 2 == 1) // jumps per two blocks
				continue;

//			if ((i + 1) == x) {
//				System.out.print(X[i] + " ");
//				continue;

			else {
				temp[0] = X[i];
				temp[1] = X[(i + 1)];
				X[i + 1] = temp[0];
				X[i] = temp[1];
			}
			System.out.print(X[i] + " " + X[i + 1] + " ");

//			if (X.length % 2 != 0 && x % 2 == 0 && i + 2 == x)
//				System.out.print(X[i+2]);

		}

		if (X.length % 2 != 0 && x % 2 != 0)
			System.out.print("\nMiddle value untouched: " + X[x + 1]);
		if (X.length % 2 != 0 && x % 2 == 0)
			System.out.print("\nMiddle value untouched: " + X[x]);

//		if (X.length % 2 != 0 && x % 2 == 0) { // if array is odd and the divided value is even, print out middle value
//			System.out.print(X[x]);
//		}

		System.out.print('\n' + "Second part: ");

		for (int k = x; k < X.length; k++) {

			if (x % 2 != 0 && k == x)
				continue;

			if (X.length % 2 != 0 && k == x)
				continue;

			if (X.length % 2 != 0 && k == x + 1 && x % 2 != 0) {
				continue;
			}

//			if ((k + 1) == X.length) {
//
//				System.out.print(X[k] + " ");
//				break;
//			} // to remove this was to avoid an out of bounds if the second part had to be odd
//				// but now it must be even always so no longer necessary

			sum = X[k] + X[k + 1];
			X[k + 1] = sum;

			System.out.print(X[k] + " " + X[k + 1] + " ");
			k++;
		}

	}
}

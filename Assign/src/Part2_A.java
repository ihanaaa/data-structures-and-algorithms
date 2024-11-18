import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Part2_A { 


	public static void StrikeEdgeZeroA(Scanner sc, PrintWriter pw) {

		int i = 0;
		int j = 0; // this for the position of where the game starts
		int k = 0; // this is for the position of the array to add values
		int[] SEZ1 = null;

		pw.println("Output:");

		while (sc.hasNextLine()) {

			if (sc.hasNextInt() != true)
				sc.nextLine();

			else {

				while (sc.hasNext() == true) {

					if (i == 0) {
						i++;
						sc.nextLine();
					}

					else if (i == 1) {
						SEZ1 = new int[sc.nextInt()];
						i++;
						continue;

					} else if (i == 2) {
						j = sc.nextInt();
						i++;
						continue;

					} else {

						if (SEZ1 != null) {
							for (k = 0; k < SEZ1.length; k++) {
								if (k == SEZ1.length - 1) {
									SEZ1[k] = 0;
								} else {
									SEZ1[k] = sc.nextInt();
								}
							}

							pw.println(moveRightorLeftA(j, SEZ1));
							i = 0;
							j = 0;

						}
					}
				}
			}
		}
		sc.close();
		pw.close();
	}

	public static int moveRightorLeftA(int x, int[] A) {

		if (A[x] == 0) {
			return 1;
		}

		int moveRight = x + A[x];
		int moveLeft = x - A[x];

		if (moveRight < A.length && A[moveRight] == A[x] && moveLeft < 0 && (A[moveRight] + A[moveRight]) > A.length) {
			return 0;
		}

		else if (moveRight < A.length && moveRightorLeftA(moveRight, A) == 1) {
				return 1;
			}

		else if (moveLeft > 0 && moveRightorLeftA(moveLeft, A) == 1) {
				return 1;
			}

		return 0;

	}

	public static void main(String[] args) throws IOException {

		PrintWriter pw = null;
		Scanner scan = null;
		try {
			scan = new Scanner(new FileInputStream("C:\\COMP352\\Assign\\in.txt"));
			pw = new PrintWriter(new FileOutputStream("C:\\COMP352\\Assign\\out.txt"));

		}

		catch (Exception e) {
			System.out.println("There was an error! Please try again.");
		}
		StrikeEdgeZeroA(scan, pw);
	}
}
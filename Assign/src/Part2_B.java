import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Part2_B {// works sometimes

	public static void StrikeEdgeZeroB(Scanner sc, PrintWriter pw) {

		int i = 0;
		int j = 0;
		int c = 0;
		int k = 0;
		ArrayList<Integer> SEZ2 = new ArrayList<Integer>();
		pw.println("Output:");

		while (sc.hasNextLine()) {
			if (sc.hasNextInt() != true)
				sc.nextLine();

			else {

				while (sc.hasNext() == true) {

					if (i == 0) {
						i++;
						sc.nextLine();
					} else if (i == 1) {
						i++;
						c = sc.nextInt();
						continue;
					} else if (i == 2) {
						j = sc.nextInt();
						i++;
						continue;
					} else {
						for (k = 0; k < c; k++) {
							if (k != c - 1) {
								SEZ2.add(sc.nextInt());
							} else {
								SEZ2.add(0);
							}
						}
						if (SEZ2.isEmpty() == false) {
							pw.println(moveRightorLeftB(j, SEZ2));
							SEZ2.clear();
							i = 0;
							j = 0;
							c = 0;
						}
					}

				}
			}
		}
		sc.close();
		pw.close();
	}

	public static int moveRightorLeftB(int x, ArrayList<Integer> A) {

		while (x < A.size()) {

			if (A.get(x) == 0) {
				return 1;
			}

			int moveRight = x + A.get(x);
			int moveLeft = x - A.get(x);

			if (moveRight < A.size() && A.get(moveRight) == A.get(x) && moveLeft < 0
					&& (A.get(moveRight) + A.get(moveRight)) > A.size()) {
				return 0;
			}
			
			if (moveRight > A.size() && moveLeft < 0) {
				return 0;
			}

			else if (moveRight < A.size() && (moveRight + moveRight) < A.size()) {
				x = moveRight;
			}

			else if (moveLeft > 0) {
				x = moveLeft;
			}
		}
		return 0;

//		while (x < A.size()) {
//			
//			Random random = new Random();
//			int r = random.nextInt(11);
//			
//			if (r % 2 == 0) {
//				if (A.get(x) < (A.size() - x)) {
//					x = x + A.get(x);
//				}
//			} else {
//				if (A.get(x) < x) {
//					x = x - A.get(x);
//				}
//			}
//			if (x == A.size() - 1) {
//				return 1;
//			}
//
//			if (A.get(x) < (A.size() - 1) && A.get(x) == A.get(x + A.get(x)))
//				return 0;
//		}
//		return 0;
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
		StrikeEdgeZeroB(scan, pw);
	}

}

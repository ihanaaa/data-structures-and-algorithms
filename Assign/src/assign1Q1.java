import java.util.Scanner;

public class assign1Q1 {

	public static void main(String[] args) {

		int[] coffee = new int[12]; // it's even and when split in half they're even
		int[] milk = new int[10]; // it's even and when split in half they're odd
		int[] chai = new int[7]; // it's odd so ignore the middle and they're odd
		int[] juice = new int[9]; // it's odd so ignore the middle and they're even

		coffee[0] = 0;
		coffee[1] = 1;
		coffee[2] = 2;
		coffee[3] = 3;
		coffee[4] = 4;
		coffee[5] = 5;
		coffee[6] = 6;
		coffee[7] = 7;
		coffee[8] = 8;
		coffee[9] = 9;
		coffee[10] = 10;
		coffee[11] = 11;

		milk[0] = 0;
		milk[1] = 1;
		milk[2] = 2;
		milk[3] = 3;
		milk[4] = 4;
		milk[5] = 5;
		milk[6] = 6;
		milk[7] = 7;
		milk[8] = 8;
		milk[9] = 9;

		chai[0] = 0;
		chai[1] = 1;
		chai[2] = 2;
		chai[3] = 3; 
		chai[4] = 4;
		chai[5] = 5;
		chai[6] = 6;

		juice[0] = 0;
		juice[1] = 1;
		juice[2] = 2;
		juice[3] = 3;
		juice[4] = 4; 
		juice[5] = 5;
		juice[6] = 6;
		juice[7] = 7;
		juice[8] = 8;

		arrayMixer aM = new arrayMixer();
		aM.mix(coffee);
		System.out.println('\n');
		aM.mix(milk);
		System.out.println('\n');
		aM.mix(chai);
		System.out.println('\n');
		aM.mix(juice);

		System.out.println('\n');
		Scanner scan = new Scanner(System.in);
		System.out.print("How big is the array? ");
		int hm = scan.nextInt();
		int[] mixItUp = new int[hm];
		for (int i = 0; i < mixItUp.length; i++) {
			System.out.print("Give values: ");
			int nb = scan.nextInt();
			mixItUp[i] = nb;
		}

		aM.mix(mixItUp);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////practice
//		int c = coffee.length / 2;
//		int m = milk.length / 2;
//		int ch = chai.length / 2;
//		int j = juice.length / 2;
//		int sum = 0;		

//		System.out.print("First part: ");
//
//		int temp[] = new int[2];
//		for (int i = 0; i < c; i++) {
//			if (i % 2 == 1) // jumps per two blocks
//				continue;
//			if ((i + 1) == c) // if odd, then it will skip the middle value from being switched
//			{
//				System.out.print(coffee[i] + " ");
//				continue;
//			} else {
//				temp[0] = coffee[i];
//				temp[1] = coffee[(i + 1)];
//				coffee[i + 1] = temp[0];
//				coffee[i] = temp[1];
//			}
//			System.out.print(coffee[i] + " " + coffee[i + 1] + " ");
//
//		}
//		System.out.print('\n' + "Second part: ");
//
//		for (int k = c; k < coffee.length; k++) {
//
//			if ((k + 1) == coffee.length) {
//				if (k % 2 == 1) {
//					System.out.print(coffee[k] + " ");
//					break;
//				} else
//					break;
//			}
//			sum = coffee[k] + coffee[k + 1];
//			coffee[k + 1] = sum;
//
//			System.out.print(coffee[k] + " " + coffee[k + 1] + " ");
//			k++;
//		}
//		System.out.println('\n');
//		System.out.print("First part: ");
//
//		for (int i = 0; i < m; i++) {
//			if (i % 2 == 1) // jumps per two blocks
//				continue;
//			if ((i + 1) == m) // if odd, then it will skip the middle value from being switched
//			{
//				System.out.print(milk[i] + " ");
//				continue;
//			} else {
//				temp[0] = milk[i];
//				temp[1] = milk[(i + 1)];
//				milk[i + 1] = temp[0];
//				milk[i] = temp[1];
//			}
//			System.out.print(milk[i] + " " + milk[i + 1] + " ");
//
//		}
//		System.out.print('\n' + "Second part: ");
//
//		for (int k = m; k < milk.length; k++) {
//
//			if ((k + 1) == milk.length) {
//				if (k % 2 == 1) {
//					System.out.print(milk[k] + " ");
//					break;
//				} else
//					break;
//			}
//			sum = milk[k] + milk[k + 1];
//			milk[k + 1] = sum;
//
//			System.out.print(milk[k] + " " + milk[k + 1] + " ");
//			k++;
//		}

	}

}

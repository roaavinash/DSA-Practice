package DSA_25_11_2022;

import java.util.Scanner;

public class sandglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = readinput();
		int val = reversepyramid(n);
		pyramid(n);
	}

	static int readinput() {
		Scanner avi = new Scanner(System.in);
		int n = avi.nextInt();
		return n;
	}

	static int reversepyramid(int val) {
		for (int i = 1; i <= val; i++) {
			for (int j = 1; j <= val; j++) {
				if (j >= i) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}

			}

			System.out.println();
		}
		return val;
	}

	static void pyramid(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if (j <= i) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}

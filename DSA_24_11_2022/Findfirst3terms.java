package DSA_24_11_2022;

import java.util.Scanner;

public class Findfirst3terms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		computed();
	}

	static void computed() {
		int count = 1;
		int i = 1;
		while (count <= 3) {
			int val = 4 * i + 9;
			if ((val) % 3 == 0) {
				System.out.println(i);
				count++;
			}
			i++;
		}
	}
}

package DSA_23_11_2022;

import java.util.Scanner;

public class usingmethodchecknumisEvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = readinput();
		//int v=check(n);
		check(n);
	}

	static int readinput() {
		Scanner avi = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int n = avi.nextInt();
		return n;
	}
	static void check(int v) {
		int even;
		if (v % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

	/*static int check(int v) {
		int even;
		if (v % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		return v;
*/
	}



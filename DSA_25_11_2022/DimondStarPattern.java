rrrrr               package DSA_25_11_2022;

import java.util.Scanner;

public class DimondStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner avi = new Scanner(System.in);
		System.out.println("Enter the row size ");
		int row = avi.nextInt();
		int col = 2 * row - 1;
		
		pyramid(row, col);
		int row1=row-1;
		int col1=2*row1-1;
		Reverse(row1, col1);
		
	}

	static void pyramid(int row, int col) {

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				if (j >= row - i + 1 && j <= row + i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	static void Reverse(int row, int col) {

		for (int i = row; i >= 1; i--) {
			for (int j = col; j >= 1; j--) {
				if (j >= row - i + 1 && j <= row + i - 1) {
					if(j==row+i-1) {
						
					
					System.out.print(" *");
					
				}else {
					System.out.print("*" );
				}
				}	
					else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
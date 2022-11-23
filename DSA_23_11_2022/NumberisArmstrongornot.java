package DSA_23_11_2022;

import java.util.Scanner;

public class NumberisArmstrongornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=readinput();
       armstrong(n);
	}
	static int readinput() {
		Scanner avi=new Scanner(System.in);
		int n=avi.nextInt();
		return n;
	}
	static void armstrong(int n) {
		int temp=n;
		int sum=0;
		while(n>0) {
			int digit=n%10;
			int cube=digit*digit*digit;
			sum=sum+cube;
			n=n/10;
			
		}
		if(sum==temp) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
		
	}

}

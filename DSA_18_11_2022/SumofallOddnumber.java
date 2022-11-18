package DSA_18_11_2022;

import java.util.Scanner;

public class SumofallOddnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner avi=new Scanner(System.in);
		int num=avi.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++) {
			if(i%2==1) {
				sum +=i;
			}
			
		}
		System.out.println(sum);
	} 

}

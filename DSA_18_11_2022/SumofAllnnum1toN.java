package DSA_18_11_2022;

import java.util.Scanner;

public class SumofAllnnum1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner avi=new Scanner(System.in);
        
        System.out.println("Enter the Number:");
        int num=avi.nextInt();
        int sum=0 ;
        for(int i=1;i<=num;i++) {
        	
        	sum= sum + i;
        	
        }
        System.out.println("Sum of all num is: "+sum);
	}

}

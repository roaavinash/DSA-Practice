package DSA_18_11_2022;

import java.util.Scanner;

public class Multipleof7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner avi=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=avi.nextInt();
        int count=num/7;
        for(int i=0;i<=count;i++) {
        	int val=i*7;
        	System.out.println("Multiple of 7  is: "+val);
        	
        	
        }
	}

}

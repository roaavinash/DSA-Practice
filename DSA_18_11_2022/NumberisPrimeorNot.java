package DSA_18_11_2022;

import java.util.Scanner;

public class NumberisPrimeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner avi=new Scanner(System.in);
       System.out.println("Enter the Number:");
       int num=avi.nextInt();
       int count=0;
       for(int i=1;i<=num;i++) {
    	   if(num%i==0) {
    		   count++;
    	   }
       }
       if(count == 2) {
    	   System.out.println("Prime");
       }
       else {
    	   System.out.println("Not  a Prime");
       }
	}

}

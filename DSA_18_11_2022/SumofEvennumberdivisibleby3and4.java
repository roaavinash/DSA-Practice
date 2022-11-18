package DSA_18_11_2022;

import java.util.Scanner;

public class SumofEvennumberdivisibleby3and4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner avi=new Scanner(System.in);
       System.out.println("Enter the Number:");
       int num=avi.nextInt();
       int sum=0;
       for(int i=0;i<num;i++) {
    	   if(i%3==0 && i%4==0) {
    		   sum=sum+i;
    		   
    	   }
       }
       System.out.println("Sum is: "+sum);
	}

}

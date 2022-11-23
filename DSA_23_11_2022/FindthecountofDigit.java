package DSA_23_11_2022;

import java.util.Scanner;

public class FindthecountofDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner avi=new Scanner(System.in);
       System.out.println("Enter the number:");
       int num=avi.nextInt();
       int count=0;
       if(num==0) {
    	   count=1;
       }
       while(num>0) {
    	   
    	   
    	   count++;
    	 num=num/10;
    	   
       }
       System.out.println("Number of Digit :"+count);
       
	}

}

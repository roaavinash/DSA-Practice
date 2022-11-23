package DSA_23_11_2022;

import java.util.Scanner;

public class ReversenumberPalindromeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner avi=new Scanner(System.in);
      System.out.println("Enter the Number: ");
      int num=avi.nextInt();
      int temp=num; //temp is used to store the value of num
     int rev=0;
      while(num>0) {
    	  int digit=num%10;
    	 rev =rev*10+digit;
    	 
    	  num=num/10;
   
      }
      System.out.println("Reverse number is: "+rev);
      if(rev==temp) {
    	  System.out.println("Palindrome");
      }
      else {
    	  System.out.println("Not a Palindrome");
      }
	}

}

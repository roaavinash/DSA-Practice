package DSA_18_11_2022;

import java.util.Scanner;

public class usermessageprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner avi=new Scanner(System.in);
      int num=avi.nextInt();
      avi.nextLine();
      System.out.println("Enter the  message:");
      String count=avi.nextLine();
   
      for(int i=0;i<num;i++) {
    	  System.out.println("Message is:  "+count);
      }
	}

}

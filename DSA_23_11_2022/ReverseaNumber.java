package DSA_23_11_2022;

import java.util.Scanner;

public class ReverseaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner avi=new Scanner(System.in);
      int num=avi.nextInt();

      
      while(num>0) {
    	  int digit=num%10;
    	  System.out.print(digit+" ");
       num=  num/10;
      }
	}

}

package DSA_21_11_2022;

import java.util.Scanner;

public class Printnumber1to15usingWhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner avi=new Scanner(System.in);
         System.out.println("Enter the number is ");
         int n=avi.nextInt();
         int i=1;
         int sum=0;
         int product=1;
         while(i<=n) {
        	  if(i%2==0) {
        		  product=product*i;
        		  
        	  }
        	sum=sum+i;
        	 i++;
         }
         System.out.println("Sum is  "+sum);
         System.out.println("product   "+product);
	}

}

package DSA_25_11_2022;

import java.util.Scanner;

public class Reversepyramidwithoutspace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner avi=new Scanner(System.in);
       System.out.println("Enter the row size: ");
       int row=avi.nextInt();
       System.out.println("Enter the col size : ");
       int col=avi.nextInt();
       for(int i=row;i>=1;i--) {
    	   for(int j=col;j>=1;j--) {
    		   if(j>=row-i+1 && j<=row+i-1) {
    			   System.out.print("*");
    		   }
    		   else {
    			   System.out.print(" ");
    		   }
    	   }
    	   System.out.println();
       }
	}

}

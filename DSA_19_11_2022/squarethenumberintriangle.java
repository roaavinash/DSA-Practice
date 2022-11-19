package DSA_19_11_2022;

import java.util.Scanner;

public class squarethenumberintriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner avi=new Scanner(System.in);
		System.out.println("Enter the row ");
		int num=avi.nextInt();
		System.out.println("Enter the colum");
		int num1=avi.nextInt();
		System.out.println("Enter the number start to print the square:");
		int n=avi.nextInt();
		
       for(int i=1;i<=num;i++) {
    	   for(int j=1;j<=num1;j++) {
    		   if(i>=j) {
    			   System.out.print(n*n+" ");
    			   n++;
    		   }
    		  
    	   }
    	   System.out.println();
       }
	}

	}



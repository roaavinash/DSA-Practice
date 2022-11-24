package DSA_24_11_2022;

import java.util.Scanner;

public class Printnumberindignoal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner avi=new Scanner(System.in);
		System.out.println("Enter the rowsize");
		int row=avi.nextInt();
		System.out.println("Enter the colsize");
		int col=avi.nextInt();
      for(int i=1;i<=row;i++) {
    	  for(int j=1;j<=col;j++) {
    		  if(i==j) {
    			  System.out.print(i+" ");
    		  }
    		  else {
    			  System.out.print(" ");
    		  }
    	  }
    	  System.out.println();
	}
	}
}

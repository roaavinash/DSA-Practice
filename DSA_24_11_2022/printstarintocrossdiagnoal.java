package DSA_24_11_2022;

import java.util.Scanner;

public class printstarintocrossdiagnoal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner avi=new Scanner(System.in);
		System.out.println("Enter the rowsize");
		int row=avi.nextInt();
		System.out.println("Enter the colsize");
		int col=avi.nextInt();
      for(int i=0;i<row;i++) {
    	  for(int j=col-1;j>=0;j--) {
    		  if(i==j) {
    			  System.out.print("*"+" ");
    		  }
    		  else {
    			  System.out.print(" ");
    		  }
    	  }
    	  System.out.println();
      }
	}

}

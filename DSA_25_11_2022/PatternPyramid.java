package DSA_25_11_2022;

import java.util.Scanner;

public class PatternPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner avi=new Scanner(System.in);
      int row=avi.nextInt();
      int col=avi.nextInt();
      for(int i=1;i<=row;i++) {
    	  for(int j=1;j<=col;j++) {
    		  if(j<=col-i) {
    			  System.out.print(" ");
    		  }
    		  else {
    			  System.out.print("* ");
    		  }
    	  }
    	  System.out.println();
      }
    		  
	}

}

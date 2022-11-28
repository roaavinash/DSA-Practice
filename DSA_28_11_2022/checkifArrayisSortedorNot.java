package DSA_28_11_2022;

import java.util.Scanner;

public class checkifArrayisSortedorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner avi=new Scanner(System.in);
      System.out.println("Enter the  size of Array");
      int n=avi.nextInt();
      int a[]=new int[n];
      for(int i=0;i<a.length;i++) {
    	  a[i]=avi.nextInt();
      }
      boolean flag=true;
      for(int i=0;i<a.length-1;i++) {
    	  if(!(a[i+1]>=a[i])) {
    		  flag=false;
    		  break;
    	  }
      }
      if(flag==false) {
    	  System.out.println("No");
      }
      else {
    	  System.out.println("Yes");
      }
	}

}

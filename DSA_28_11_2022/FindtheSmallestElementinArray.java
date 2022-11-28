package DSA_28_11_2022;

import java.util.Scanner;

public class FindtheSmallestElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner avi=new Scanner(System.in);
      int n=avi.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++) {
    	  a[i]=avi.nextInt();
    	  
      }
      int small=a[0];
      for(int i=0;i<n;i++) {
    	  if(small>a[i]) {
    		  small=a[i];
    	  }
      }
      System.out.println(small);
	}

}

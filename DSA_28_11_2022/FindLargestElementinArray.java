package DSA_28_11_2022;

import java.util.Scanner;

public class FindLargestElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner avi=new Scanner(System.in);
       System.out.println("Enter the no of Element");
       int n=avi.nextInt();
       System.out.println("Enter the element ");
       int a[]=new int[n];
       for(int i=0;i<n;i++) {
    	   a[i]=avi.nextInt();
       }
       int large=0;
       for(int i=0;i<n;i++) {
    	   if(a[i]>large) {
    		   large=a[i];
    	   }
       }
       System.out.println("Large element is: "+large);
	}

}

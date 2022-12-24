package DSA_20_12_2022;

import java.util.Arrays;
import java.util.Scanner;

public class SwapFirstandLastElementoftheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner avi=new Scanner(System.in);
	        int n=avi.nextInt();
	        int a[]=new int[n];
	        for(int i=0;i<n;i++) {
	        	a[i]=avi.nextInt();
	        }
	        for(int i=0;i<a.length;i++) {
	        	if(a.length>=2) {
	        		int temp=a[0];
	        		a[0]=a[a.length-1];
	        		a[a.length-1]=temp;
	        	}
	        }
	        		System.out.println(Arrays.toString(a));
	        	
	       
	}

}

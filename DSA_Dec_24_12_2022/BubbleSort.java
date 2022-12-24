package DSA_20_12_2022;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner avi=new Scanner(System.in);
	        int n=avi.nextInt();
	        int a[]=new int[n];
	        for(int i=0;i<n;i++) {
	        	a[i]=avi.nextInt();
	        }
	        for(int i=0;i<a.length-1;i++) {
	        	for(int j=0;j<a.length-1-i;j++) {
	        		if(a[j]>a[j+1]) {
	        			int temp=a[j];
	        			a[j]=a[j+1];
	        			a[j+1]=temp;
	        		
	        	
	        	System.out.println(Arrays.toString(a));
	        }}
	}}

}

package DSA_28_11_2022;

import java.util.Scanner;

public class CountPositivenumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner avi=new Scanner(System.in);
       System.out.println("Enter the no of element");
        int n=avi.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
        	a[i]=avi.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++) {
        	if(a[i]>0) {
        		count++;
        	}
        }
        System.out.println("Positive number are "+count);
	}

}

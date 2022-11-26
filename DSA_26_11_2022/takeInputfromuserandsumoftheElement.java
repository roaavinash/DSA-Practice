package DSA_26_11_2022;

import java.util.Scanner;

public class takeInputfromuserandsumoftheElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner avi=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=avi.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Element");
        for(int i=0;i<a.length;i++) {
        	a[i]=avi.nextInt();
        }
        int sum=0;
        for(int  i=0;i<a.length;i++) {
        	sum=sum+a[i];
        }
        	
        System.out.println("Sum of the number  "+sum);
	}

}

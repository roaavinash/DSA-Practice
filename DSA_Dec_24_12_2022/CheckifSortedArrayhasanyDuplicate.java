package DSA_20_12_2022;

import java.util.Scanner;

public class CheckifSortedArrayhasanyDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner avi=new Scanner(System.in);
        int n=avi.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
        	a[i]=avi.nextInt();
        }
        boolean flag=false;
        for(int i=0;i<n-1;i++) {
        	if(a[i]==a[i+1]) {
        		flag=true;
        		break;
        	}
        
        }
	
        if(flag==true) {
        	System.out.println("yes");
        }
        else {
        	System.out.println("No");
        
        }
	}
}

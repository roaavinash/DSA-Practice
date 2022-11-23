package DSA_23_11_2022;

import java.util.Scanner;

public class usingmethodmultiplicationofn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=readinput();
       multiplication(n);
	}
	static int readinput() {
		Scanner avi=new Scanner(System.in);
		int n=avi.nextInt();
		return n;
	}
      static void multiplication(int n) {
    	
    	  for(int i=1;i<=10;i++) {
    		
    		  System.out.println(n*i);
    	  }
    	 
      }
}

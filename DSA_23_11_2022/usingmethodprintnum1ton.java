package DSA_23_11_2022;

import java.util.Scanner;

public class usingmethodprintnum1ton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=readinput();
       int v=printnum( n);
       
	}
	static int readinput() {
		Scanner avi=new Scanner(System.in);
		int n=avi.nextInt();
		return n;
	}
      static int printnum(int n) {
    	  for(int i=1;i<=n;i++) {
    		  System.out.println(i);
    	  }
    	  return n;
      }
}

package DSA_28_11_2022;

import java.util.Scanner;

public class counthowmanyCharacterofLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner avi=new Scanner(System.in);
      int n=avi.nextInt();
      char a[]=new char[n];
      avi.nextLine();
      for(int i=0;i<a.length;i++) {
    	  String s=avi.nextLine();
    	   a[i]=s.charAt(0);
      }
      int count=0;
      for(int i=0;i<a.length;i++) {
    	  if(a[i]>='a' && a[i]<='z') {
    		  count++;
    	  }
      }
      System.out.println(count);
	}
	

}

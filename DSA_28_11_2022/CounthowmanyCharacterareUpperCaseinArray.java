package DSA_28_11_2022;

import java.util.Scanner;

public class CounthowmanyCharacterareUpperCaseinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner avi=new Scanner(System.in);
      int n=avi.nextInt();
      avi.nextLine();
      char ch[]=new char[n];
      for(int i=0;i<ch.length;i++) {
    	  
    	String  s=avi.nextLine();
    	ch[i]=s.charAt(0);
      }
     int count=0;
      for(int i=0;i<ch.length;i++) {
    	  if(ch[i] >= 65 && ch[i] <= 90) {
    		  count++;
    	  }
      }
      System.out.println(count);
	}

}

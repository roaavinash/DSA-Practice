package DSA_21_11_2022;

import java.util.Scanner;

public class AYearisLeapYearorNot {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
     Scanner avi=new Scanner(System.in);
     System.out.println("Enter the year:");
     int year=avi.nextInt();
       boolean leap = false;
     if(year%4==0) {
    	 if(year%100==0) {
    		 if(year%400==0) {
    			leap = true;
    		 }
    	 }
    
    	 else {
    		 leap=true;
    		}
    	 }
     System.out.println(leap);
	}
     

}

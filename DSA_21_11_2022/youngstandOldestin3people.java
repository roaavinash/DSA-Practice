package DSA_21_11_2022;

import java.util.Scanner;

public class youngstandOldestin3people {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner avi=new Scanner(System.in);
       System.out.println("Enter the age of rahul");
       int rahul=avi.nextInt();
       System.out.println("Enter the age of avinash");
       int avinash=avi.nextInt();
       System.out.println("Enter the age of dev");
       int dev=avi.nextInt();
       if(dev>rahul && dev>avinash) {
    	   System.out.println("Dev is oldest");
       }
       else if(rahul>dev && rahul>avinash) {
    	   System.out.println("Rahul is oldest");
       }
       else {
    	   System.out.println("Avinash is oldest");
       }
       
	}

}

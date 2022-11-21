package DSA_21_11_2022;

import java.util.Scanner;

public class convertfahreheittoCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner avi=new Scanner(System.in);
		System.out.println("Enter the fahrenit");
		float f=avi.nextFloat();
      
       double c=(f-32)/1.8000;
       System.out.println(c);
	}

}

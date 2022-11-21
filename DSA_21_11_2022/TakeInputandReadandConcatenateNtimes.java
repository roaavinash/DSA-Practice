package DSA_21_11_2022;

import java.util.Scanner;

public class TakeInputandReadandConcatenateNtimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner avi=new Scanner(System.in);
    	int n=avi.nextInt();
    	int i=1;
    	avi.nextLine();
    	String con="welcome to  ";
    	while(i<=n) {
    		System.out.println("Enter the Message: ");
    		String s=avi.nextLine();
    		con=con+s+" ";
    		i++;
    	}
    	System.out.println(con);
       
	}

}

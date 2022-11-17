package dsa(04-11-2022);

import java.util.Scanner;

public class StringMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner avi=new Scanner(System.in);
        int x1=avi.nextInt();
	        int y1=avi.nextInt();
	        System.out.println();
	        int x2=avi.nextInt();
	        int y2=avi.nextInt();
	        double d=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	        System.out.println(d);
	}

}

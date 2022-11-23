package DSA_23_11_2022;

import java.util.Scanner;

public class usingmethodforsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int num=readinput();
		int sum=inputsumm(num);
		System.out.println(sum);
		}
	static int readinput(){
		Scanner avi=new Scanner(System.in);
		int num=avi.nextInt();
		return num;
	}
	static int inputsumm(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum=sum+i; 
			
		}
		return sum;
	}

}

package DSA_21_11_2022;

import java.util.Scanner;

public class MarksofStudentandgetpercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Scanner avi=new Scanner(System.in);
     System.out.println("Enter the math marks");
     int math=avi.nextInt();
     System.out.println("Enter the science marks");
     int science=avi.nextInt();
     System.out.println("Enter the English marks");
     int English=avi.nextInt();
     if(math>100 || science >100 || English>100) {
     
    
    	 System.out.println("Invaide Data");
    	 return;
     }
     double   total=math+science+English;
     double   percentage=(total/300)*100;
     System.out.println("Total marks is "+total);
     System.out.println("percentage is :"+percentage);
 	}
}
    
   
   


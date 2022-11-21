package DSA_21_11_2022;

public class findtheFollowingExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int y=5;
        int x=2;
        int z=0;
        boolean flag =false  ;
        if(x==2) {
        	
        	flag=true;
        }
        else if(x!=5) {
      flag=true;
        }
        else if(x!=5 && y>=5)
        {
        	flag=true;
        }
        else if(z!=0 || x==2 ) {
        	flag=true;
        }
       
	
	System.out.println("X is Equal to 2 is "+flag);
	System.out.println("value of x and y is: "+ flag);
  	System.out.println("Value of x is "+flag);
  	System.out.println("Value of z and x is: " +flag);
  	
	}
}

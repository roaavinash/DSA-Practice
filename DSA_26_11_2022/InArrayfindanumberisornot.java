package DSA_26_11_2022;

public class InArrayfindanumberisornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {1,45,32,25,54,31};
      int b=45; 
      boolean flag=false;
      for(int i=0;i<a.length;i++) {
    	
      
    	  if(b==a[i]) {
    		  flag=true;
    		 
    	  }
      }
    	  if(flag==true) {
    		  System.out.println("Persent");
    	  }
    	  else {
    		  System.out.println("Not Persent");
    	  }
      
	
	}
}

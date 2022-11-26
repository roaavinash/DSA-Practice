package DSA_26_11_2022;

public class createanArrayandprintelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {1,5,4,3,2,6,9};
        for(int i=0;i<a.length;i++) {
        	System.out.println(a[i]);
        	
        } int sum=0;
        for( int i=a.length-1;i>=0;i--) {
    		System.out.print(a[i]+" ");
    	
       
       
        	sum+=a[i];
        	
        }
        System.out.println(sum);
	}

}

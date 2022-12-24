package DSA_20_12_2022;

import java.util.Arrays;

public class Sort0sand1susingTwoPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {0,1,1,0,1,0};
      int i=0;
      int j=a.length-1;
      while(i<j) {
    	  if(a[i]==0) {
    		  i++;
    	  }
    	  if(a[j]==0) {
    		  j--;
    	  }
    	  if(a[i]==1 && a[j]==0) {
    		  int temp=a[i];
    		  a[i]=a[j];
    		  a[j]=temp;
    		  i++;
    		  j--;
    	  }
  
    }
      System.out.println(Arrays.toString(a));
	}
	
}

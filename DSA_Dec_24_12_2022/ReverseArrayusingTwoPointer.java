package DSA_20_12_2022;

public class ReverseArrayusingTwoPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,5,1,7,4,5};
	 int i=0;
	 int j=a.length-1;
	 while(i<=j) {
		 int temp=a[i];
		 a[i]=a[j];
		 a[j]=temp;
		 i++;
		 j--;
		 
	 }
	 for(int k=0;k<a.length;k++) {
		 System.out.println(a[k]);
	 }

	}

}

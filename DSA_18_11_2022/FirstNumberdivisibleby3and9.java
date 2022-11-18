package DSA_18_11_2022;

public class FirstNumberdivisibleby3and9 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        for(int i=1;i<20;i++) {
        	if(i%3==0 && i%9==0) {
        		System.out.println(i);
        		break;
        	}
        }
	}

}

package DSA_24_11_2022;

public class findFirst7termNinto6N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        computed();
	}
	static void computed() {
		int count=1;
		int i=1;
		while(count<=7) {
		if((6*i+i)%6==0) {
			System.out.println(i);
			count++;
			
		}
		i++;
	}
	}
}

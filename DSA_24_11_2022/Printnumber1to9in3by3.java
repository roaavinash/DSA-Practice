package DSA_24_11_2022;

public class Printnumber1to9in3by3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 1; i < 4; i++) {
			count +=1;
			int x=count;
			for (int j = 1; j < 4; j++) {
            
				System.out.print(x + " ");
				x+=3;
				
			}
			
			System.out.println();
		}

	}

}

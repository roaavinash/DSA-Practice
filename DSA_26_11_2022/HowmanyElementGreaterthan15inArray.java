package DSA_26_11_2022;

public class HowmanyElementGreaterthan15inArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 20, 30, 40, 50 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 15) {
				count++;

			}

		}
		System.out.println(count);
	}

}

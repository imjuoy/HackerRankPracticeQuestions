package Algorithms;

public class sieveofEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		boolean arr[] = new boolean[n];
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (arr[i] == false)
				count++;
			for (int j = 2; i * j < n; j++) {
				arr[i * j] = true;
			}

		}
		System.out.println(count);

	}

}

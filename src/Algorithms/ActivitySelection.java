/**
 * Activity Selection Algorithm
 * When Input is sorted - O(n)
 * When input is not sorted as per finishing time - O(nlogn)
 */

package Algorithms;

public class ActivitySelection {

	public static void getActivitySelection(int[] starttime, int[] endtime, int n) {
		int i = 0;// This will keep a track of the array that has the start time.
		System.out.println("Below are the jobs that are selected as a part of activity selection algorithm");
		// Since the first element is always selected.
		System.out.println(i + " ");
		for (int j = 1; j < n; j++) {
			if (endtime[i] <= starttime[j]) {
				System.out.println(j + " ");
				i = j;
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s[] = { 1, 3, 0, 5, 8, 5 };
		int f[] = { 2, 4, 6, 7, 9, 9 };
		int n = s.length;

		getActivitySelection(s, f, n);

	}

}

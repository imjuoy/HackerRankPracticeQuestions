package DataStructures;

import java.util.ArrayList;

public class PascalsTriangleII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> result = new ArrayList<Integer>();
		int rowNum = 3;
		for (int row = 0; row < rowNum + 1; row++) {
			result.add(0, 1);
			System.out.println(result.toString());
			for (int j = 1; j < result.size() - 1; j++) {
				result.set(j, result.get(j) + result.get(j + 1));
			}
		}

		System.out.println(result.toString());

	}

}

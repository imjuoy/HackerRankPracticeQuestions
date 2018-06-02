package DataStructures;

import java.util.ArrayList;
import java.util.List;

public class AllNumbersDisappearedInAnArray {

	public List<Integer> findDisappearedNumbers(int[] nums) {

		List<Integer> result = new ArrayList<Integer>();

		int length = nums.length;
		boolean flag = false;
		for (int i = 1; i <= length; i++) {
			flag = false;
			for (int j = 0; j < length; j++) {
				if (i == nums[j])
					flag = true;
			}
			if (!flag)
				result.add(i);
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AllNumbersDisappearedInAnArray a = new AllNumbersDisappearedInAnArray();

		int[] nums = { 4, 2, 4, 2 };

		List<Integer> result = a.findDisappearedNumbers(nums);

		System.out.println(result.toString());

	}

}

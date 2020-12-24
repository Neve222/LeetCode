package leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author mmn
 * @date 2020/5/12
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 *  给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 */
public class LeetCode01 {

	public static void main(String[] args) {
		int[] nums = {2, 8, 5, 15};
		int[] ints = twoSum(nums, 10);
		System.out.println(Arrays.toString(ints));
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] ins = new int[2];

//		for (int i = 0; i<nums.length - 1; i++) {
//			for (int j = i + 1; j<nums.length; j++) {
//				if (nums[i] + nums[j] == target) {
//					ins[0] = i;
//					ins[1] = j;
//					return ins;
//					}
//				}
//			}
		//		上述方法执行时间太久，

		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (hashMap.containsKey(nums[i])) {
				ins[0] = hashMap.get(nums[i]);
				ins[1] = i;
			}
			hashMap.put(target - nums[i], i);
		}

		return ins;
	}
}

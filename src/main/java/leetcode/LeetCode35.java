package leetcode;

/**
 * @author mmn
 * @date 2020/5/9
 *
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 你可以假设数组中无重复元素。
 *
 * 输入: [1,3,5,6], 5
 * 输出: 2
 */
public class LeetCode35 {
	public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		int target = 8;

		int i = searchInsert(nums, target);
		System.out.println(i);

	}

	public static int searchInsert(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > target || nums[i] == target) {
				return i;
			}
		}

		return nums.length;
	}
}

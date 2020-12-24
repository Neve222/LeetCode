package leetcode;

import java.util.Arrays;

/**
 * @author mmn
 * @date 2020/5/11
 *
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 */
public class LeetCode66 {

	public static void main(String[] args) {
		int[] nums = {9};
		int[] ints = plusOne(nums);
		System.out.println(Arrays.toString(ints));
	}

	public static int[] plusOne(int[] digits) {

		int count = digits.length - 1;
		int end = digits[count] + 1;
		if (end < 10) {
			digits[count] = digits[count] + 1;
			return digits;
		} else {
			for (int i = count; i >= 0; i--) {
				int sum = digits[i] + 1;
				if (sum < 10) {
					digits[i] = sum;
					return digits;
				} else {
					if (digits[0] + 1 >= 10 ) {
						digits = new int[digits.length + 1];
						digits[0] = 1;
						return digits;
					}


					digits[i] = sum % 10;
				}

			}
		}
		return digits;
	}
}

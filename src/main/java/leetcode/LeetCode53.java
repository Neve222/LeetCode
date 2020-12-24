package leetcode;

/**
 * @author mmn
 * @date 2020/5/11
 *
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *
 * [-2,1]
 * 1
 */
public class LeetCode53 {
	public static final Integer ERROR_CODE_BUSY = -1;
	public static void main(String[] args) {
		int[] nums = {4,-1,2,1,-5,6};
		int i = maxSubArray(nums);
		System.out.println(i);


		System.out.println(ERROR_CODE_BUSY.equals(-1));
	}

	public static int maxSubArray(int[] nums) {
		int res = nums[0];
		int sum = 0;
		for (int num : nums) {
			if (sum > 0) {
				sum += num;
			} else {
				sum = num;
			}
			res = Math.max(res, sum);
		}
		return res;

//		-2,1,-3,4,-1,2,1,-5,4
		/*int sum = nums[0];
		for (int i = 0; i < nums.length - 1; i++) {
				int res = sum + nums[i+1];
				if (res > sum) {
					sum = res;
				} else {
					sum = nums[i] > nums[i + 1] ? sum : nums[i+1];
					if (res > sum) {
						sum = res;
					}
				}

		}
		return sum;*/
	}

}

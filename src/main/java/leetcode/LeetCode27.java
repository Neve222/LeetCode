package leetcode;

/**
 * @author mmn
 * @date 2020/5/8
 */
public class LeetCode27 {
	/**
	 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
	 *
	 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
	 *
	 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
	 *
	 * 给定 nums = [3,2,2,3], val = 3,
	 *
	 * 函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
	 *
	 * 你不需要考虑数组中超出新长度后面的元素。
	 *
	 * 来源：力扣（LeetCode）
	 * 链接：https://leetcode-cn.com/problems/remove-element
	 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
	 * 0,1,2,2,3,0,4,2
	 * 2
	 */

	public static void main(String[] args) {
//		int[] nums = {0,1,2,2,3,0,4,2};
		int[] nums = {2,2,2,3};
		int val = 3;
		int i = removeElement(nums, val);
		System.out.println(i);
	}

	public static int removeElement(int[] nums, int val) {

		int j = 0;
		for (int i = 0; i<nums.length; i++) {
			if (nums[i] != val) {
				nums[j] = nums[i];
				j++;
			}

		}
		return j;
	}

}

package leetcode;

import java.util.Arrays;

/**
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 *  
 *
 * 示例 1:
 *
 * 给定数组 nums = [1,1,2],
 *
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 *
 * @author mmn
 * @date 2020/8/19
 */
public class LeetCode26 {
    public static void main(String[] args) {
//        int[] nums = {1,2};
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
//0,1,2,3,4
        System.out.println(removeDuplicates(nums));

    }

    public static int removeDuplicates(int[] nums) {
      /*  int j = 1;
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 0; i< nums.length -1; i++) {
            if (nums[i+1] != nums[i]) {
                nums[i] = nums[i+1];
                result[j] = nums[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(result));
        return j;*/

// {0,0,1,1,1,2,2,3,3,4};
//0,1,2,3,4
        int j = 1;
        for (int i = 0; i< nums.length -1; i++) {
            if (nums[i+1] != nums[i]) {
                nums[j] = nums[i+1];
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return j;
    }
}

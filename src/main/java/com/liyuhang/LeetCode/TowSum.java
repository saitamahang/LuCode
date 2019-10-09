package com.liyuhang.LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LiYuHang
 * @date 2019年10月09日
 */
public class TowSum {
    public static void main(String[] args) {
        int test[] = {1,2,3,4,5,6,7,8};
        int target = 9;
        // System.out.println(method_one(test, target).toString());
    }

    /**
     * 方法一： 双层遍历
     * @param nums 源数组
     * @param target 目标数字
     * @return 结果集
     */
    public static int [] method_one (int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 方法二： 两遍哈希表
     * @param nums 源数组
     * @param target 目标数字
     * @return 结果集
     */
    public static int [] method_tow (int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 方法三： 一遍哈希表
     * @param nums 源数组
     * @param target 目标数字
     * @return 结果集
     */
    public static int [] method_three (int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

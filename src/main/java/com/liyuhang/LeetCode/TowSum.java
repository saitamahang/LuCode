package com.liyuhang.LeetCode;

public class TowSum {
    public static void main(String[] args) {
        int test[] = {1,2,3,4,5,6,7,8};
        int target = 9;
        System.out.println(method_one(test, target).toString());
    }

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
}

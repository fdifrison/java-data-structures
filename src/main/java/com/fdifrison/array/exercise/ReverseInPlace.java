package com.fdifrison.array.exercise;

import java.util.Arrays;

public class ReverseInPlace {

    public static void main(String[] args) {
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        solve(array);
    }

    private static void solve(int[] nums) {
        System.out.println(Arrays.toString(nums));
        swap(nums, nums.length - 1);
    }

    private static void swap(int[] nums, int end) {
        var start = 0;
        while (start < end) {
            var temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
            System.out.println(Arrays.toString(nums));
        }
    }
}

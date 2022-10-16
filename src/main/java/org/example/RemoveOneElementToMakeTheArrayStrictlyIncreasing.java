package org.example;

public class RemoveOneElementToMakeTheArrayStrictlyIncreasing {
    public boolean canBeIncreasing(int[] nums) {

        int result = 0;

        for (int i = 1; i < nums.length && result < 2; i++) {
            if (nums[i - 1] >= nums[i]) {
                result++;
            }
            if (i > 1 && nums[i - 2] >= nums[i])
                nums[i] = nums[i - 1];
        }

        return result == 1;
// 1 2 10 3 5
    }
}

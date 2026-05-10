import java.util.Arrays;

class Solution {

    public int jump(int[] nums) {

        int memo[] = new int[nums.length];

        Arrays.fill(memo, -1);

        return fun(nums, 0, memo);
    }

    private int fun(int[] nums, int idx, int memo[]) {

        // reached last index
        if(idx >= nums.length - 1){
            return 0;
        }

        // already calculated
        if(memo[idx] != -1){
            return memo[idx];
        }

        int min = Integer.MAX_VALUE;

        for(int jump = 1; jump <= nums[idx]; jump++){

            int next = fun(nums, idx + jump, memo);

            if(next != Integer.MAX_VALUE){
                min = Math.min(min, 1 + next);
            }
        }

        memo[idx] = min;

        return memo[idx];
    }
}
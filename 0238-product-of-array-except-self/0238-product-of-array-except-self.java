class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int zeroCount = 0;
        int product = 1;
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                product *= num;
            }
        }
        for (int i = 0; i < n; i++) {
            if (zeroCount > 1) {
                res[i] = 0;
            } else if (zeroCount == 1) {
                res[i] = (nums[i] == 0) ? product : 0;
            } else {
                res[i] = product / nums[i];
            }
        }
        return res;
    }
}
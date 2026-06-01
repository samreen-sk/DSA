class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> idx = new Stack<>();
        int res[] = new int[nums.length];
        int n = nums.length;
        for(int i = 2 * n - 1; i >= 0; i--) {
            if(idx.isEmpty()) {
                if(i < n) {
                    res[i] = -1;
                }
                idx.push(i % n);
            }
            else if(nums[idx.peek()] > nums[i % n]) {
                if(i < n) {
                    res[i] = nums[idx.peek()];
                }
                idx.push(i % n);
            }

            else if(nums[idx.peek()] <= nums[i % n]) {

                while(!idx.isEmpty() && nums[i % n] >= nums[idx.peek()]) {
                    idx.pop();
                }
                if(i < n) {
                    if(idx.isEmpty()) {
                        res[i] = -1;
                    }
                    else {
                        res[i] = nums[idx.peek()];
                    }
                }
                idx.push(i % n);
            }
        }
        return res;
    }
}
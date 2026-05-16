class Solution {
    public int findMin(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for(int num : nums){
            ans = Math.min(ans,num);
        }
        return ans;
    }
}
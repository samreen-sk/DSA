class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int totalArraySum = 0;
        int n = nums.length;

        for (int i = 0; i < n; ++i) {
            totalArraySum += nums[i];
        }
        if (totalArraySum % k != 0) {
            return false;
        }
        int targetSum = totalArraySum/k;
        boolean[] visited = new boolean[n];
        return backtrack(nums,0,0,0,k,targetSum,visited);
    }
    private boolean backtrack(int[] arr, int st,int count, int currSum,int k, int targetSum,boolean[]visited ){
        int n = arr.length;
        if (count == k - 1) {
            return true;
        }
        if (currSum > targetSum) {
            return false;
        }
        if (currSum == targetSum) {
            return backtrack(arr,0, count + 1, 0, k, targetSum, visited);
        }
        for (int j = st; j < n; ++j) {
            if (!visited[j]) {
                visited[j] = true;

                if (backtrack(arr,j+1, count, currSum + arr[j], k, targetSum, visited)) {
                    return true;
                }
                visited[j] = false;
            }
        }

        return false;
    }
}
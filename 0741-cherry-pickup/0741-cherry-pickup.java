class Solution {
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        dp[0][0] = grid[0][0];
        for (int step = 1; step <= 2 * (n - 1); step++) {
            int[][] dp1 = new int[n][n];
            for (int i = 0; i < n; i++) {
                Arrays.fill(dp1[i], -1);
            }
            for (int r1 = 0; r1 < n; r1++) {
                for (int r2 = 0; r2 < n; r2++) {
                    int c1 = step - r1;
                    int c2 = step - r2;
                    if (c1 < 0 || c2 < 0 || c1 >= n || c2 >= n) {
                        continue;
                    }
                    if (grid[r1][c1] == -1 || grid[r2][c2] == -1) {
                        continue;
                    }
                    int best = -1;
                    if (dp[r1][r2] != -1) {
                        best = Math.max(best, dp[r1][r2]);
                    }
                    if (r1 > 0 && dp[r1 - 1][r2] != -1) {
                        best = Math.max(best, dp[r1 - 1][r2]);
                    }
                    if (r2 > 0 && dp[r1][r2 - 1] != -1) {
                        best = Math.max(best, dp[r1][r2 - 1]);
                    }
                    if (r1 > 0 && r2 > 0 && dp[r1 - 1][r2 - 1] != -1) {
                        best = Math.max(best, dp[r1 - 1][r2 - 1]);
                    }
                    if (best == -1) {
                        continue;
                    }
                    int cherry = best + grid[r1][c1];
                    if (r1 != r2) {
                        cherry += grid[r2][c2];
                    }
                    dp1[r1][r2] = Math.max(dp1[r1][r2],cherry);
                }
            }
            dp = dp1;
        }
        return Math.max(0,dp[n- 1][n- 1]);
    }
}
class Solution {
    public long distributeCandies(int n, int limit) {

        long count = 0;

        for (int a = 0; a <= limit; a++) {

            int remaining = n - a;

            int left = Math.max(0, remaining - limit);

            int right = Math.min(limit, remaining);

            if (left <= right) {
                count += (right - left + 1);
            }
        }

        return count;
    }
}
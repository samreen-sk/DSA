class Solution {
    public int longestPalindromeSubseq(String s) {
        int memo[][] = new int[s.length()][s.length()];
        return getPalin(s,0,s.length()-1,memo);
    }
    public int getPalin(String s, int left,int right,int[][]memo){
        if(left>right) return 0;
        if(left==right) return 1;
        if(memo[left][right]!=0) return memo[left][right];
        if(s.charAt(left)==s.charAt(right)){
            memo[left][right] = 2 + getPalin(s,left+1,right-1,memo);
            return memo[left][right];
        }
        else{
            memo[left][right] = Math.max(getPalin(s,left+1,right,memo),getPalin(s,left,right-1,memo));
            return memo[left][right];
        }
    }
}
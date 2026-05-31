class Solution {
    public int digitFrequencyScore(int n) {
        int[] arr = new int[10];
        while(n!=0){
            int digit = n%10;
            arr[digit]++;
            n/=10;
        }
        int res = 0;
        for(int i=0;i<=9;i++){
            if(arr[i]!=0){
                res+=i*arr[i];
            }
        }
        return res;
    }
}
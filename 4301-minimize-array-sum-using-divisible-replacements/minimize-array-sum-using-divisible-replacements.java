class Solution {
    public long minArraySum(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        long sum = 0;
        for(int num : nums){
            int small = num;
            for(int d=1;d*d<=num;d++){
                if(num%d==0){
                    if(set.contains(d)){
                        small = Math.min(small,d);
                    }
                    int other = num/d;
                    if(set.contains(other)){
                        small = Math.min(small,other);
                    }
                }
            }
            sum+=small;
        }
        
        return sum;
    }
}
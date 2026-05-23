class Solution {
    public boolean check(int[] nums) {
        int[] real = nums.clone();
        Arrays.sort(nums);
        for(int start = 0; start<nums.length; start++){
            if(real[0]!=nums[start]){
                continue;
            }
             int next = start;
             int i=0;
           
            while(i<real.length && nums[next]==real[i]){
                i++;
                if(next>=real.length-1) next = 0;
                else next++;
            }
            if(i==real.length) return true;
            }
        return false;
    }
}
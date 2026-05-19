class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int common = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();
        for(int num : nums1){
            set.add(num);
        }
        for(int num : nums2){
            if(set.contains(num)){
                common=Math.min(common,num);
            }
        }
        if(common==Integer.MAX_VALUE) common=-1;
        return common;
    }
}
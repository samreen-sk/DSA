class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            String s = String.valueOf(num);
            for(char ch : s.toCharArray()){
                list.add(ch-'0');
            }
        }
        int[] result = new int[list.size()];
        int i=0;
        for(int num : list){
            result[i] = num;
            i++; 
        }
        return result;
    }
    
}
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> idx = new Stack<>();
        int res [] = new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--){
            if(idx.isEmpty()){
                idx.push(i);
                res[i]=0;
            }
            else if(temperatures[idx.peek()]>temperatures[i]){
                res[i] = idx.peek()-i;
                idx.push(i);
            }
            else if(temperatures[idx.peek()]<=temperatures[i]){
                while(!idx.isEmpty() && temperatures[i]>=temperatures[idx.peek()]){
                    idx.pop();
                }
                if(idx.isEmpty()){
                idx.push(i);
                res[i]=0;
                }
                else{
                res[i] = idx.peek()-i;
                idx.push(i);
                }
            }
        }
        return res;
    }
}
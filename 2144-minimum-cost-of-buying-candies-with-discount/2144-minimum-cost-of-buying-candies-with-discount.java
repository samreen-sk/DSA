class Solution {
    public int minimumCost(int[] cost) {
        int minCost=0;
        Arrays.sort(cost);
        if(cost.length==1) return cost[0];
        if(cost.length==2) return cost[0]+cost[1];
        int flag1=-1;
        int flag2=-1;
        for(int i=cost.length-1;i>=0;i--){
            if(flag1==-1){
                minCost+=cost[i];
                flag1=1;
            }
            else if(flag2==-1){
                minCost+=cost[i];
                flag2=1;
            }
            else{
                flag1=-1;
                flag2=-1;
            }
        }
        return minCost;
    }
}
class Solution {
    public int totalWaviness(int num1, int num2) {
        int count=0;
        for(int num=num1;num<=num2;num++){
            count+=getWaviness(num);
        }
        return count;
    }
    private int getWaviness(int num){
        int c=0;
        List<Integer> l = new ArrayList<>();
        while(num!=0){
            int d = num%10;
            l.add(0,d);
            num/=10;
        }
        for(int i=1;i<l.size()-1;i++){
            if(l.get(i)>l.get(i-1) && l.get(i)>l.get(i+1)){
                c++;
            }
            if(l.get(i)<l.get(i-1) && l.get(i)<l.get(i+1)){
                c++;
            }
        }
        return c;
    } 
}
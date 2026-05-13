class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        int ans = -1;
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                ans = i;
                break;
            }
        }
        return ans;
    }
}
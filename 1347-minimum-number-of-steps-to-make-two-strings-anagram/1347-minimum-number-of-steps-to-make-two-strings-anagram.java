class Solution {
    public int minSteps(String s, String t) {
        int steps=0;
        Map<Character,Integer> map = new HashMap<>();
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        for(int i=0;i<sChar.length;i++){
            map.put(sChar[i],map.getOrDefault(sChar[i],0)+1);
        }
        for(int i=0;i<tChar.length;i++){
            if (map.containsKey(tChar[i]) && map.get(tChar[i]) > 0) {
                map.put(tChar[i], map.get(tChar[i]) - 1);
            } else {
                steps++;
            }
        }
        return steps;
    }
}
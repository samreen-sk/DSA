class Solution {
    public int[] countWordOccurrences(String[] chunks, String[] queries) {
        StringBuilder s = new StringBuilder();
        for(String str : chunks){
            s.append(str);
        }
        HashMap<String,Integer> map = new HashMap<>();
        StringBuilder word = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='a'&&ch<='z'){
                word.append(ch);
            }
            else if(ch=='-'){
                    if(i>0 && i<s.length()-1 && Character.isLowerCase(s.charAt(i-1)) && Character.isLowerCase(s.charAt(i+1))){
                    word.append(ch);
                    
                }
                else{
                    addWord(word,map);
                }
            }
            else{
                addWord(word,map);
            }
        }
        addWord(word,map);
        int ans[] = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            ans[i] = map.getOrDefault(queries[i],0);
        }
        return ans;
    }
    private void addWord(StringBuilder word,HashMap<String,Integer> map){
        if(word.length()>0){
            String s = word.toString();
            map.put(s,map.getOrDefault(s,0)+1);
            word.setLength(0);
        }
    }
}
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        HashMap<Character, Integer> map = new HashMap<>();
        String result = "";
        for (int i = 0; i < 26; i++) {
            map.put((char)('a' + i), weights[i]);
        }
        for (String s : words) {
            int sumOfWord = 0;
            for (char ch : s.toCharArray()) {
                sumOfWord += map.get(ch);
            }
            int rem = sumOfWord % 26;
            result += (char)('z' - rem);
        }
        return result;
    }
}
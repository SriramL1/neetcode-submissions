class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int start = 0, result = 0;

        for (int i = 0; i < s.length(); i++){
            if(mp.containsKey(s.charAt(i))){
                start = Math.max(mp.get(s.charAt(i)) + 1, start);
            }
            mp.put(s.charAt(i), i);
            result = Math.max(result, i - start + 1);
        }
        return result;
    }
}

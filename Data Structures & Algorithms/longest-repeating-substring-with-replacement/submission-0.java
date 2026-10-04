class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> count = new HashMap<>();
        int result = 0;

        int l = 0, maxfinal = 0;
        for(int i = 0; i < s.length(); i++){
            count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0) + 1);
            maxfinal = Math.max(maxfinal, count.get(s.charAt(i)));
            while ((i - l + 1) - maxfinal > k){
                count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
                l++;
            }
            result = Math.max(result, i - l + 1);
        }
        return result;
    }
}

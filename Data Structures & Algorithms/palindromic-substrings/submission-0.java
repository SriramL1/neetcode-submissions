class Solution {
    public int countSubstrings(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++){
            // add palindromes from odd counter
            result += countPalindrome(s, i, i);
            // add palindromes from even counter
            result += countPalindrome(s, i, i + 1);
        }
        return result;
    }

    private int countPalindrome(String s, int l, int r){
        int result = 0;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            result++;
            l--;
            r++;
        }
        return result;
    }
}

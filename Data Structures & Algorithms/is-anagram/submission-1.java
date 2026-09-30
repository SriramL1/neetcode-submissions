class Solution {
    public boolean isAnagram(String s, String t) {
        char [] sSort = s.toCharArray();
        char [] tSort = t.toCharArray();
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j <= t.length(); j++){
                if(s.length() == t.length()){
                   
                   Arrays.sort(sSort);
                   Arrays.sort(tSort);

                   return Arrays.equals(sSort, tSort);
                }
            }
        }
        return false;
    }
}

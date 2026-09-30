class Solution {
    public boolean isPalindrome(String s) {
        // create an empty string
        StringBuilder newString = new StringBuilder();
        // loop through each character in the input string
        for(char c: s.toCharArray()){
            // if c is alphanumeric -> convert to lower case and add
            // and add it to newStirng
            if(Character.isLetterOrDigit(c)){
                newString.append(Character.toLowerCase(c));
            }
        }
        return newString.toString().equals(newString.reverse().toString());

    }
}


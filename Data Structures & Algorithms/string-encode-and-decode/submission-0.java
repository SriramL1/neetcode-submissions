class Solution {

    public String encode(List<String> strs) {
        //if the input list is empty, return an empty string
        if(strs.isEmpty()) return "";
        StringBuilder res = new StringBuilder();
        List<Integer> sizes = new ArrayList<>();
        // Create an empty list to store the sizes of each string.
        for(String str: strs){
            sizes.add(str.length());
        }
        // for each string append its length to the sizes list
        for(int size: sizes){
            res.append(size).append(',');
        }
        // building a single string based on input values
        res.append('#');
        for(String str: strs){
            res.append(str);
        }
        // return final encoded string
        return res.toString();
    }

    public List<String> decode(String str) {
        //if the encoded string is empty return an empty list
        if(str.length() == 0){
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        // read each character from the start until reaching '#' to extract all recorded sizes:
        int i = 0;
        while (str.charAt(i) != '#'){
            StringBuilder curr = new StringBuilder();
            while(str.charAt(i) != ','){
                curr.append(str.charAt(i));
                i++;
            }
            // parse each size by recording if a comma has been reached within the string
            sizes.add(Integer.parseInt(curr.toString()));
            i++;
        }
        // extract all substrings according to the sizes list
        i++;
        for(int size: sizes){
            // read the amount of characters for each size, and append the result (increment w/ size)
            res.add(str.substring(i, i + size));
            i += size;
        }
        // return the list of decoded strings
        return res;
    }
}

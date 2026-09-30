class Solution {
    public int longestConsecutive(int[] nums) {
        //Convert the list into a set for O(1) lookups
        Set<Integer> numSet = new HashSet<>();
        // for every num in nums, add the next set of nums
        for(int num: nums){
            numSet.add(num);
        }
        // initialize the longest track value
        int longestTrack = 0;
        // for each number in numSet
        for(int num: numSet){
            // if num - 1 is not in the set
            if(!numSet.contains(num - 1)){
                // initialize the length to 1
                int length = 1;
                // while numSet contains num + length, increment length
                while (numSet.contains(num + length)){
                    length++;
                }
                // update the longest track with the max length found
                longestTrack = Math.max(longestTrack, length);
            }
            
        }
        // return longest after checking all the numbers.
        return longestTrack;
    }
}

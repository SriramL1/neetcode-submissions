class Solution {
    public int[] twoSum(int[] nums, int target) {
        // create a hashmap to store the value and index of each element in the array
        HashMap<Integer, Integer> prevMap = new HashMap<>();
        // iterate through the array using index i and compute complement of current element: target - nums[i]
        for (int i = 0; i < nums.length; i++)
        {
            int num = nums[i];
            int diff = target - num;
            // check if complement exists in hashmap
            if (prevMap.containsKey(diff)){
                // return indices of current element if it does
                return new int[] {prevMap.get(diff), i};
            }
            prevMap.put(num, i);
        }
        // if no pair, return empty array
        return new int[] {};
    }
}

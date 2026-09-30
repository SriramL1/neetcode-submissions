class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        // create a list of groups freq, where freq[i] will store all numbers that appear exactly i times
        for(int i = 0; i < freq.length; i++){
            freq[i] = new ArrayList<>();
        }
        // check the value of the array and put new values, if they can be 0 or the next new value
        for(int n: nums){
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        // count the entry value and add it to the HashMap set of entries each time it appears
        for(Map.Entry<Integer, Integer> entry: count.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        //initialize an empty result list
        int[] res= new int[k];
        int index = 0;
        // loop from the largest possible frequency down to 1
        for(int i = freq.length - 1; i > 0 && index < k; i--){
            // for each number in the freq[i], add it to result list
            for(int n: freq[i]){
                res[index++] = n;
                if(index == k){
                    return res;
                }
            }
        }
        return res;

    }
}

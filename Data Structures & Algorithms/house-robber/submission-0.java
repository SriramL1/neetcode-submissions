class Solution {
    public int rob(int[] nums) {
        int rob1 = 0, rob2 =0;
        // no full dp array needed
        // keep two variables and update them as we move forward
        for (int num: nums){
            // for each house, skip it which is the previous best
            // or rob it which the house with money, and current best 
            //from two steps back
            int temp = Math.max(num + rob1, rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;
    }
}

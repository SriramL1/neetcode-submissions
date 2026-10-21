class Solution {
    public int maxProduct(int[] nums) {
        int maxHere = nums[0], minHere = nums[0], result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int x = nums[i];
            if (x < 0) {            // negative flips max and min
                int tmp = maxHere;
                maxHere = minHere;
                minHere = tmp;
            }
            maxHere = Math.max(x, maxHere * x);
            minHere = Math.min(x, minHere * x);
            result = Math.max(result, maxHere);
        }
        return result;
    }
}
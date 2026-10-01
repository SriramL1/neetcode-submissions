class Solution {
    public int findMin(int[] nums) {
        int rotation  = 0;
        int result = nums.length - 1;

        while (rotation < result){
            int middle = rotation + (result - rotation) / 2;
            if (nums[middle] < nums[result]){
                result = middle;
            } else {
                rotation = middle + 1;
            }
        }
        return nums[rotation];
    }
}

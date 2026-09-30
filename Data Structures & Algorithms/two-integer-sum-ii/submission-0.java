class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int leftIndex = 0;
        int rightIndex = numbers.length - 1;

        while (leftIndex < rightIndex)
        {
            int currentSum = numbers[leftIndex] + numbers[rightIndex];

            if(currentSum > target){
                rightIndex--;
            }
            else if (currentSum < target){
                leftIndex++;
            }
            else
            {
                return new int[] {leftIndex + 1, rightIndex + 1};
            }
        }

    return new int[0];

    }
}

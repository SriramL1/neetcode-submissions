class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        result = new ArrayList<>();
        Arrays.sort(nums);

        // define a recursive call function
        dfs(0, new ArrayList<>(), 0, nums, target);
        return result;
    }
    private void dfs(int i, List<Integer> curr, int total, int[] nums, int target){
        if (total == target){
            result.add(new ArrayList<>(curr));
            return;
        }
        // allowing reuse of the same number for each position.
        for (int j = i; j < nums.length; j++){
            if (total + nums[j] > target){
                return;
            }
            curr.add(nums[j]);
            dfs(j, curr, total + nums[j], nums, target);
            curr.remove(curr.size() - 1);
        }
    }
}

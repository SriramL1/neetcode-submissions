class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        // traverse the temperature list from right to left
        for(int i = n - 2; i >= 0; i--){
            // for each day i, start with the next day j, 
            int j = i + 1;
            // while j is within bounds and not warmer
            while (j < n && temperatures[j] <= temperatures[i]){
                if (res[j] == 0){
                    j = n;
                    break;
                }
                j += res[j];
            }
            if (j < n){
                res[i] = j - i;
            }
        }
        return res;
    }
}

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, target, 0, new ArrayList<Integer>(), res);
        return res;
    }
    
    private void dfs(int[] nums,
                     int remainSum,
                     int startIndex,
                     List<Integer> subset,
                     List<List<Integer>> res) {
        if (remainSum == 0) {
            res.add(new ArrayList<Integer>(subset));
            return;
        }
        
        for (int i = startIndex; i < nums.length; i++) {
            if (nums[i] > remainSum) {
                return;
            }
            subset.add(nums[i]);
            dfs(nums, remainSum - nums[i], i, subset, res);
            subset.remove(subset.size() - 1);
        }
    }
}

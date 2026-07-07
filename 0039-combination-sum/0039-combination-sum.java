import java.util.*;

class Solution {

    public static void cs(int[] candidates, int target,
                          List<List<Integer>> res,
                          List<Integer> ans,
                          int i) {

        // Base Case
        if (target == 0) {
            res.add(new ArrayList<>(ans));
            return;
        }

        if (i == candidates.length || target < 0) {
            return;
        }

        // Include current element
        ans.add(candidates[i]);
        cs(candidates, target - candidates[i], res, ans, i);

        // Backtrack
        ans.remove(ans.size() - 1);

        // Exclude current element
        cs(candidates, target, res, ans, i + 1);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        cs(candidates, target, res, ans, 0);

        return res;
    }
}
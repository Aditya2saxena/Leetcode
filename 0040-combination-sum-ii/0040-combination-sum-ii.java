import java.util.*;

class Solution {

    public void solve(int[] candidates, int target,
                      List<List<Integer>> res,
                      List<Integer> ans,
                      int index) {

        if (target == 0) {
            res.add(new ArrayList<>(ans));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {

            // Skip duplicates
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }

            // No need to continue if target is already exceeded
            if (candidates[i] > target) {
                break;
            }

            ans.add(candidates[i]);

            // Move to next index (element can be used only once)
            solve(candidates, target - candidates[i], res, ans, i + 1);

            // Backtrack
            ans.remove(ans.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        solve(candidates, target, res, ans, 0);

        return res;
    }
}
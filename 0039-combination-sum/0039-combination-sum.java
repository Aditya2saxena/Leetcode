class Solution {
    public static void cs(int[] candiates,int target,List<List<Integer>>res,List<Integer>ans,int i){
        if(i==candiates.length || target<0){
            return;
        }
        if(target==0){
            res.add(new ArrayList<>(ans));
            return;
        }
        ans.add(candiates[i]);
        // single inclusion
        cs(candiates,target-candiates[i],res,ans,i);
        // multiple inclusion
        //cs(candiates,target-candiates[i],res,ans,i);
        // backtrack
        ans.remove(ans.size()-1);
        cs(candiates,target,res,ans,i+1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>>res=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        cs(candidates,target,res,ans,0);
        return res;
    }
}
class Solution {
    static void subset(int[]nums,List<Integer>curr,int i,List<List<Integer>>ans){
        if(i==nums.length){
            ans.add( new ArrayList<>(curr));
            return;
        }
        // inculsion
        curr.add(nums[i]);          
        subset(nums,curr,i+1,ans);
        // exclusion
        curr.remove(curr.size()-1);
        subset(nums,curr,i+1,ans);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        subset(nums,curr,0,ans);
        return ans;
        
    }
}
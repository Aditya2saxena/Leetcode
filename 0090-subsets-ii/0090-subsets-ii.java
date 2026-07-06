class Solution {
    static void subset(int nums[],List<Integer>curr,List<List<Integer>>ans ,int i){
        if(i==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        // inculsion
        curr.add(nums[i]);
        subset(nums,curr,ans,i+1);
        // backtrack
        curr.remove(curr.size()-1);
        // skip dependencies
        
        while( (i+1<nums.length) && (nums[i]==nums[i+1]) ){
            i++;
        }
        // exclude
        subset(nums,curr,ans,i+1);

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        subset(nums,curr,ans,0);
        return ans;

        
    }
}
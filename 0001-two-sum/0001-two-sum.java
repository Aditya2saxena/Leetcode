class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans.add(i);
                    ans.add(j);
                }
            }
        }
        return new int[]{ans.get(0),ans.get(1)};
        
    }
}
class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int freq[]=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        for(int i=1;i<nums.length;i++){
            if(freq[i]>1){
                return i ;
            }
        }
        return -1;
        
        
        

        
    }
}
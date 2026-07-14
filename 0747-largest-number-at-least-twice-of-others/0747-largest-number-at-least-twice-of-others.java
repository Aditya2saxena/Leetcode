class Solution {
    public int dominantIndex(int[] nums) {
        int max=Integer.MIN_VALUE;
        int maxIndex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                maxIndex=i;
            }
        }
       for (int j = 0; j < nums.length; j++) {
        if (j == maxIndex)continue;
        if (max < 2 * nums[j]) {
            return -1;
        }
      }
      return maxIndex;
    
    }
}
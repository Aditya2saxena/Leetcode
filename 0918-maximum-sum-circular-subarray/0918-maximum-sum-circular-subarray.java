class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int totalSum = 0;

    
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];

            sum += nums[i];
            max = Math.max(max, sum);

            if (sum < 0) {
                sum = 0;
            }
        }

    
        if (max < 0) {
            return max;
        }

    
        sum = 0;                       
        int min = Integer.MAX_VALUE; 

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];
            min = Math.min(min, sum);

            if (sum > 0) {
                sum = 0;
            }
        }

        
        return Math.max(max, totalSum - min);
    }
}
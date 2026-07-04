class Solution {
    public static void getperms(int nums[],List<List<Integer>>res,int i){
        if(i==nums.length){
            List<Integer>temp=new ArrayList<>();
            for(int num:nums){
                temp.add(num);
            }
            res.add(temp);
            return;
        }
        for(int j=i;j<nums.length;j++){
            swap(nums,i,j);
            getperms(nums,res,i+1);
            swap(nums,i,j);
            
        }

    }
    public static void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        
        getperms(nums,res,0);
        return res;
        
    }
}
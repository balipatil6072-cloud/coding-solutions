class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        
                int cnt=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+nums[i+1]==k || nums[i]==k)
            cnt++;
            
        }
        return cnt;
    }
}
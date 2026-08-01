class Solution {
    public boolean isPerfectSquare(int num) {
       int low=0;
       int high=num;
       int ans;
       while(low<=high){
        int mid=low+(high-low)/2;
        long sq=mid*mid;
        if(sq==num) return true;
        else if(sq>num) high=mid-1;
        else low=mid+1;
       
       }
        return false;
    }
}
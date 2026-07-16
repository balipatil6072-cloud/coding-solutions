class Solution {
    public boolean checkZeroOnes(String s) {
        int cnt1=0,cnt0=0;
        int max1=0,max0=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                cnt1++;
                cnt0=0;
            }
            else {
                cnt0++;
                cnt1=0;
            }
            max1=Math.max(max1,cnt1);
            max0=Math.max(max0,cnt0);
        }
        return max1>max0;
    }
}
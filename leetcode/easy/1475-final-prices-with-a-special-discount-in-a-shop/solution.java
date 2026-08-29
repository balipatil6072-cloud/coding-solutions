class Solution {
    public int[] finalPrices(int[] prices) {
        
        int[]disc=new int[prices.length];  
        for(int i=0;i<prices.length;i++){
            disc[i]=prices[i];
            for(int j=i+1;j<prices.length;j++){
            if(prices[i]>=prices[j]){
                int dis=prices[i]-prices[j];
                disc[i]=dis;
                break;
            }
            
        
        }

        }
        return disc;
    }
}
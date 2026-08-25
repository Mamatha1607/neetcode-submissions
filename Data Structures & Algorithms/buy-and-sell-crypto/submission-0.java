class Solution {
    public int maxProfit(int[] prices) {
        int Max=0,Minprice=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<Minprice){
                Minprice=prices[i];
                
            }
            Max= Math.max(Max,prices[i]-Minprice);
        }
        return Max;
    }
}

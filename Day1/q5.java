class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int minsofar = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            minsofar = Math.min(minsofar, prices[i]);
            int temp = prices[i] - minsofar;
            max = Math.max(max, temp);
        }
        return max;
    }
}
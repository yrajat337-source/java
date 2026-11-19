class Solution {
    public int maxProfit(int[] prices) {
        int lowestPrice = Integer.MAX_VALUE;
        int bestProfit = 0;

        for (int price : prices) {
            lowestPrice = Math.min(lowestPrice, price);
            bestProfit = Math.max(bestProfit, price - lowestPrice);
        }
        return bestProfit;
    }
}

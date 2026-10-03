class Solution {
    public int maxProfit(int[] prices) {
         int minPrice = Integer.MAX_VALUE, best = 0;

    for (int price : prices) {
        if (price < minPrice) {
            // SAY: "A new low means a better day to buy."
            minPrice = price;
        } else {
            // SAY: "Otherwise I check the profit from selling today."
            best = Math.max(best, price - minPrice);
        }
    }
    // SAY: "If prices only fall, best stays 0."
    return best;
    }
}

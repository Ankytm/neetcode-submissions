class Solution {
    fun maxProfit(prices: IntArray): Int {


      if(prices.size == 0 || prices.size == 1) return 0         

      var maxProfit = 0

      var left = 0

      var right = 1

      while(right < prices.size) {

          if(prices[left] < prices[right]) {
          
                 val profit = prices[right] - prices[left]

                 maxProfit = maxOf(maxProfit, profit)

          } else {

            left = right
           }

          right++
      }

      return maxProfit
          
    }
}

func maxProfit(prices []int) int {
	maxP := 0
	l, r := 0, 1

	for r < len(prices){
		if(prices[l] < prices[r]){
			profit := prices[r] - prices[l]
			maxP = max(profit, maxP)
		}else{
			l=r
		}
		r++
	}
	return maxP
}

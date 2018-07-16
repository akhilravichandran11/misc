#!/usr/bin/python

def maxProfit(prices):
	print(prices)
	cur_min = prices[0]
	max_price = 0
	for  cur_num in prices:
		cur_min = min(cur_min,cur_num)
		max_price = max(max_price,cur_num-cur_min)
		print(cur_num," ",cur_min," ",max_price)
	return max_price
prices = [7, 1, 5, 3, 6, 4]

print(maxProfit(prices))
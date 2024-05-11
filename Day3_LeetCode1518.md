**Day 03: LeetCode 1518 [Water Bottle]**
extra problem 2
**Problem Description:**
There are numBottles water bottles that are initially full of water. You can exchange numExchange empty water bottles from the market with one full water bottle.

The operation of drinking a full water bottle turns it into an empty bottle.

Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.

Example 1:
Input: numBottles = 9, numExchange = 3
Output: 13
Explanation: You can exchange 3 empty bottles to get 1 full water bottle.
Number of water bottles you can drink: 9 + 3 + 1 = 13.
Example 2:
Input: numBottles = 15, numExchange = 4
Output: 19
Explanation: You can exchange 4 empty bottles to get 1 full water bottle. 
Number of water bottles you can drink: 15 + 3 + 1 = 19.

Constraints:
1 <= numBottles <= 100
2 <= numExchange <= 100

**Link to LeetCode Problem:**
https://leetcode.com/problems/water-bottles/description/

![Day3_LeetCode1518](https://github.com/404reese/100DaysOfJava/assets/135740066/717d0634-b0d2-4dbc-8ffb-59d0c3881c17)


**My Thought Process:**
- person will drink given no of bottle for 1st time for sure  so drink = numBottles
- here i was using for look then after time i realized if no empty bottles is greater than or equal to min no of exchange bottle then only we can make exchange so while numBottles>numExchange
- by division we get how many bottle we can exchange(a) (adding that to drink variable)
- by % we get remaining  bottles(b)
- now numBottles = a+b and loop continuos 

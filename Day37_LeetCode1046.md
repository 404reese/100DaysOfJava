**Day 37: LeetCode 1046 [Find the Duplicate Number]**

**Problem Description:**
You are given an array of integers stones where stones[i] is the weight of the ith stone.
We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together. Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:
If x == y, both stones are destroyed, and
If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
At the end of the game, there is at most one stone left.
Return the weight of the last remaining stone. If there are no stones left, return 0.

Example 1:
Input: stones = [2,7,4,1,8,1]
Output: 1
Explanation: 
We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of the last stone.

**Link to LeetCode Problem:**
https://leetcode.com/problems/last-stone-weight/description/

**Thought Process:**
using priority queue to keep track of the heaviest stones, and repeatedly smash the two heaviest ones until only one is left. Will return the weight of the last remaining stone, or 0 if there are no stones left
![image](https://github.com/404reese/100DaysOfJava/assets/135740066/25a175c9-61d7-4161-aaa6-770800d6f026)

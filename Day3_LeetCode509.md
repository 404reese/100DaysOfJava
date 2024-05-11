**Day 03: LeetCode 509 [Fibonacci Number]**

**Problem Description:**
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).

Example 1:
Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

Example 2:
Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.

Example 3:
Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
 

Constraints:
0 <= n <= 30

**Link to LeetCode Problem:**
https://leetcode.com/problems/fibonacci-number/description/

**My Thought Process:**
- fibonacci series : 0 1 1 2 3 5 8 ....
- for 0 & 1 returning 0 & 1 resp
- for third term adding 0+1=1 (which is n3) and returning
- then 1+1 which is 2 and so on

![image](https://github.com/404reese/100DaysOfJava/assets/135740066/0d0b5bd7-ca6e-482c-a234-73ee8adf278b)

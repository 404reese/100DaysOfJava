**Day 03: LeetCode 1137 [Tribonacci Number]**

doing on more problem with similar approach 
**Problem Description:**
The Tribonacci sequence Tn is defined as follows: 

T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.

Given n, return the value of Tn.

Example 1:
Input: n = 4
Output: 4
Explanation:
T_3 = 0 + 1 + 1 = 2
T_4 = 1 + 1 + 2 = 4
Example 2:
Input: n = 25
Output: 1389537

Constraints:
0 <= n <= 37
The answer is guaranteed to fit within a 32-bit integer, ie. answer <= 2^31 - 1.

**Link to LeetCode Problem:**
https://leetcode.com/problems/n-th-tribonacci-number/description/

**My Thought Process:**
- Tribonacci series : 0 1 1 2 4 7 13 ....
- for 0 & 1 returning 0 & 1 resp
- for 2 returning n2 i.e. is 1
- for fourth term adding 0+1+1=2 (which is n4) and returning
- then 1+1+2 which is 4 and so on

![image](https://github.com/404reese/100DaysOfJava/assets/135740066/f300caaf-6816-4790-ad17-d19b4567d6fe)

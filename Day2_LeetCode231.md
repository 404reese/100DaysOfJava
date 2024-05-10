**Day 02: LeetCode 231 [Power of Two]**

**Problem Description:**
Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.

Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1
Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16
Example 3:

Input: n = 3
Output: false
 

Constraints:
-2^31 <= n <= 2^31 - 1

**Link to LeetCode Problem:**
https://leetcode.com/problems/power-of-two/description/

**My Thought Process:**
- negative number in power of 2 will make it img number so for (n<0) returning false
- also there is no power of two for which ans will be 0 so for (n=0) returning false
- all power of two are divisible by two to dividing n until it we get 1 or odd number
  e.g. 2^3 is 8 -> 8/2 = 4 -> 4/2 = 2 -> 2/2 = 1
- expecption to this is 1 which is 2^0

![Day2_LeetCode231](https://github.com/404reese/100DaysOfJava/assets/135740066/6b371262-4f49-428f-8aec-3f26c803c0cb)

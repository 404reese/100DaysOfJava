**Day 28: LeetCode 2529 [Maximum count of Positive and Negative Integer]**

**Problem Description:**
Given an array nums sorted in non-decreasing order, return the maximum between the number of positive integers and the number of negative integers.

In other words, if the number of positive integers in nums is pos and the number of negative integers is neg, then return the maximum of pos and neg.
Note that 0 is neither positive nor negative.

Example 1:
Input: nums = [-2,-1,-1,1,2,3]
Output: 3
Explanation: There are 3 positive integers and 3 negative integers. The maximum count among them is 3.

**Link to LeetCode Problem:**
https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/description/

so we need to find the maximum count between positive and negative integers
so will create two counters, one for positive and one for negative. Then, it iterate through the array, incrementing the corresponding counter for each number
Finally, returning the maximum of the two counters using Math.max

![image](https://github.com/404reese/100DaysOfJava/assets/135740066/857b160d-45e7-4dc6-b28b-8b418b5fb242)

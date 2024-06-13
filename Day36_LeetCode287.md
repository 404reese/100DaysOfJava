**Day 36: LeetCode 287 [Find the Duplicate Number]**

**Problem Description:**
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and uses only constant extra space.
Example 1:
Input: nums = [1,3,4,2,2]
Output: 2

**Link to LeetCode Problem:**
https://leetcode.com/problems/find-the-duplicate-number/description/

**Thought Process:**
since we know there's a duplicate number in here somewhere. Once we find the intersection point of the cycle, we can reset one of the pointers to the start and move them both one step at a time to find the start of the cycle, which will be the duplicate number.

![image](https://github.com/404reese/100DaysOfJava/assets/135740066/8d120262-d6e9-4282-aa6b-88557f585fcf)

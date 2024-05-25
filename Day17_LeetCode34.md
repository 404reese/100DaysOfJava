**Day 17: LeetCode 34 [Find first and last Position of Element]**

**Problem Description:**
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

**Link to LeetCode Problem:**
https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

**My thought process:**
we need to find the starting and ending positions of a target value in a sorted array. Since the array is sorted, we can use binary search to find the target.

performiing binary search to find the target value. If we find it, will then search to the left and right of the found index to find the starting and ending positions of the target value.

If we don't find the target value, I'll return [-1, -1] to indicate that it's not in the array.
![image](https://github.com/404reese/100DaysOfJava/assets/135740066/6d58617f-9a7b-4d10-80c7-24004bf874ea)

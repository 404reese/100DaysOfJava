**Day 18: LeetCode 33 [Search in Rotated Sorted Array ]**

**Problem Description:**
There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

**Link to LeetCode Problem:**
https://leetcode.com/problems/search-in-rotated-sorted-array/description/

**My thought process:**
using binary search to find the target value in the rotated sorted array
from middle if the left half of the array is sorted, we compare the target to the left and middle elements to determine which half to search in
if the left half is not sorted, we compare the target to the middle and right elements to determine which half to search in
will keep updating the left or right pointer based on the comparison and repeat the process until we find the target or exhaust all possible search ranges
If we don't find the target, we return -1

![image](https://github.com/404reese/100DaysOfJava/assets/135740066/66a1eb69-67c7-41e7-9866-7d2c3d846a7c)

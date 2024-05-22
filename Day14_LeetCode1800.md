**Day 14: LeetCode 1800 [Maximum Ascending Subarray Sum]**

**Problem Description:**
Given an array of positive integers nums, return the maximum possible sum of an ascending subarray in nums.

A subarray is defined as a contiguous sequence of numbers in an array.

A subarray [numsl, numsl+1, ..., numsr-1, numsr] is ascending if for all i where l <= i < r, numsi  < numsi+1. Note that a subarray of size 1 is ascending.

Example 1:
Input: nums = [10,20,30,5,10,50]
Output: 65
Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.
Example 2:
Input: nums = [10,20,30,40,50]
Output: 150
Explanation: [10,20,30,40,50] is the ascending subarray with the maximum sum of 150.
Example 3:
Input: nums = [12,17,15,13,10,11,12]
Output: 33
Explanation: [10,11,12] is the ascending subarray with the maximum sum of 33.
Constraints:
1 <= nums.length <= 100
1 <= nums[i] <= 100

**Link to LeetCode Problem:**
https://leetcode.com/problems/maximum-ascending-subarray-sum/description/

**My thought process:**
This solution uses two variables to keep track of the current sum and the maximum sum found so far. It iterates through the array and checks if the current element is less than the next element. If it is, it adds the current element to the current sum. If it is not, it compares the current sum to the maximum sum found so far and updates the maximum sum if necessary. It then resets the current sum to 0. After the loop, it checks the last subarray and updates the maximum sum if necessary.

![image](https://github.com/404reese/100DaysOfJava/assets/135740066/b34a1163-f59b-4cdd-a521-8987176a02ae)

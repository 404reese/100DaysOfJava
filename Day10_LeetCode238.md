**Day 10: LeetCode 238 [Product of Array Except Self]**

**Problem Description:**
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

Constraints:
2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)

**Link to LeetCode Problem:**
https://leetcode.com/problems/product-of-array-except-self/description/

**My thought process:**
First i wrote this code which exceeded time limit
![image](https://github.com/404reese/100DaysOfJava/assets/135740066/6cce711a-f701-4b4c-a8de-217c756a975c)
then used two pointer approach

![image](https://github.com/404reese/100DaysOfJava/assets/135740066/c9d7e9ce-4672-41ba-aed7-7d7552b4c1c7)

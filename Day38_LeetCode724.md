**Day 38: LeetCode 724 [Find Pivot Index]**

**Problem Description:**
Given an array of integers nums, calculate the pivot index of this array.
The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
Return the leftmost pivot index. If no such index exists, return -1.

Example 1:
Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11

**Link to LeetCode Problem:**
https://leetcode.com/problems/find-pivot-index/description/

**Thought Process:**
first calculating the total sum of the array, then iterating through the array and at each step, subtracting the current element from the total sum and adding it to the left sum. If at point where the left sum equals the remaining total sum, that's my pivot index. If not, returning -1.

![image](https://github.com/404reese/100DaysOfJava/assets/135740066/495d12d8-fe1f-4016-9ada-78f0cbcfacb9)

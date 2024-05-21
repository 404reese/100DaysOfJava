**Day 13: LeetCode 334 [Increasing Triplet Subsequence]**

**Problem Description:**
Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.

Example 1:
Input: nums = [1,2,3,4,5]
Output: true
Explanation: Any triplet where i < j < k is valid.
Example 2:
Input: nums = [5,4,3,2,1]
Output: false
Explanation: No triplet exists.
Example 3:
Input: nums = [2,1,5,0,4,6]
Output: true
Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.
 
Constraints:
1 <= nums.length <= 5 * 105
-231 <= nums[i] <= 231 - 1
 
Follow up: Could you implement a solution that runs in O(n) time complexity and O(1) space complexity?

**Link to LeetCode Problem:**
https://leetcode.com/problems/increasing-triplet-subsequence/description/

**My thought process:**
To find a triplet that satisfies the condition, we can keep track of the smallest and second smallest elements in the array.
If we find an element that is greater than the second smallest element, then we have found a triplet.
Initialize first and second to the maximum possible integer value.
In each iteration of the loop, update first or second if the current element is smaller or in between them.
If the current element is greater than second, return true.
If we iterate through the entire array and never find a triplet, return false.

![image](https://github.com/404reese/100DaysOfJava/assets/135740066/4e886439-374a-465e-940a-47aedef7063d)

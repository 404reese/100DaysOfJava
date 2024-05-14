**Day 06: LeetCode 4 [Median of Two arrays]**

**Problem Description:**
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).

Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

Constraints:
nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106

**Link to LeetCode Problem:**
https://leetcode.com/problems/median-of-two-sorted-arrays/description/

**My Thought Process:**
- mergeing two arrays then sorting it & finding median by len/2 (odd) , len/2+len/2 +1  /2 (even)


  ![image](https://github.com/404reese/100DaysOfJava/assets/135740066/665664be-3d6a-4cd7-8dfe-6029bddec9a9)

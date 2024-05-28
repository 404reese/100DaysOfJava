**Day 20: LeetCode 162 [Find Peak Element]**

**Problem Description:**
A peak element is an element that is strictly greater than its neighbors.
Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
You must write an algorithm that runs in O(log n) time.

Example 1:
Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.

**Link to LeetCode Problem:**
https://leetcode.com/problems/find-peak-element/description/

**My thought process:**
To implement binary search, we need to initialize the start and end indices to the beginning and end of the array, respectively. We then enter a while loop that continues until start is greater than end. Inside the loop, we calculate the middle index mid and check if nums[mid] is a peak. If it is, we return mid. If it's not, we need to determine on which side of mid the peak lies. If nums[mid] is less than nums[mid+1], it means that the peak lies to the right of mid, so we set start to mid+1. If nums[mid] is less than nums[mid-1], it means that the peak lies to the left of mid, so we set end to mid-1.
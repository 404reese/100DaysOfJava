**Day 11: LeetCode 747 [Largest number at least twice of others]**

**Problem Description:**
You are given an integer array nums where the largest integer is unique.
Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise.

Example 1:
Input: nums = [3,6,1,0]
Output: 1
Explanation: 6 is the largest integer.
For every other number in the array x, 6 is at least twice as big as x.
The index of value 6 is 1, so we return 1.
Example 2:
Input: nums = [1,2,3,4]
Output: -1
Explanation: 4 is less than twice the value of 3, so we return -1.
 
Constraints:
2 <= nums.length <= 50
0 <= nums[i] <= 100
The largest element in nums is unique.

**Link to LeetCode Problem:**
https://leetcode.com/problems/largest-number-at-least-twice-of-others/description/

**My thought process:**
Initialize a variable maxIndex to store the index of the maximum element in the array.
Loop through the array and update maxIndex if a larger element is found.
Loop through the array again and check if the maximum element is at least twice as large as every other element. If it is, return maxIndex. Otherwise, return -1.
Optimize the solution by checking the condition nums[maxIndex] < 2 * nums[i] only for the elements that are less than or equal to nums[maxIndex] and only for the second last element in the array. This reduces the number of comparisons even further.


![image](https://github.com/404reese/100DaysOfJava/assets/135740066/5c99fbd2-a074-4f3c-834f-eeecb61fa78d)

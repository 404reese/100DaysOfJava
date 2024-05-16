**Day 08: LeetCode 977 [Square of sorted array]**

**Problem Description:**
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

Example 1:
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 
Constraints:
1 <= nums.length <= 104
-104 <= nums[i] <= 104

**Link to LeetCode Problem:**
https://leetcode.com/problems/squares-of-a-sorted-array/description/

**My Thought Process:**
for squaring and sorting time complexcity O(n) + O(log n) = O(n log n)

so in order to find O(n) solution we need approach that avoids sorting the squares array
i.e.  two-pointer approach,

Initializing two pointers, left and right, to the beginning and end of the input array, resp
Creating a result array of the same size as the input array to storing the sorted squares.
Iterating through the input array from the end to the beginning, using a loop variable i that starts at nums.length - 1 and decrements by 1 in each iteration.
In each iteration, calculating the squares of the numbers at the current positions of the left and right pointers, and store them in variables leftSquare and rightSquare, respectively.
Comparing leftSquare and rightSquare, and add the larger one to the result array at position i.
If leftSquare is larger than rightSquare, incrementing the left pointer by 1. Otherwise, decrementing the right pointer by 1.
Repeating steps 4-6 until the left pointer is greater than or equal to the right pointer, at which point all the squares have been added to the result array.
Returning the result array.

![image](https://github.com/404reese/100DaysOfJava/assets/135740066/02c4c111-43c2-454e-997e-b57060811a67)

**Day 05: LeetCode 1464 [Maximum Product of Two Elements]**

**Problem Description:**
Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
 
Example 1:
Input: nums = [3,4,5,2]
Output: 12 
Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12. 
Example 2:
Input: nums = [1,5,4,5]
Output: 16
Explanation: Choosing the indices i=1 and j=3 (indexed from 0), you will get the maximum value of (5-1)*(5-1) = 16.
Example 3:
Input: nums = [3,7]
Output: 12

Constraints:
2 <= nums.length <= 500
1 <= nums[i] <= 10^3

**Link to LeetCode Problem:**
https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/

**My Thought Process:**
I have utilized bubble sort in first approach which has a time complexity of O(n^2)
I learned a better approach to solve this problem. Instead of sorting the entire array, we can find the maximum and second maximum elements in the array using a single pass with a time complexity of O(n).

- Initializing two variables max and sMax to the smallest possible integer value Integer.MIN_VALUE. These variables will keep track of the maximum and second maximum elements resp
- For each element nums[i], checking if it is greater than or equal to the current value of max 
	- If it is then updateing sMax to the current value of max and max to the current element.
	- If the current element is less than max but greater than or equal to sMax, update sMax to the current element.
After iterating through entire array, calculating the product of max - 1 and sMax - 1 (p)
Returning p

![image](https://github.com/404reese/100DaysOfJava/assets/135740066/101e3645-ba58-4833-8645-ad7de634ecbe)

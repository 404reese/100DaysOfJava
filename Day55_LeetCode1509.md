**Day 55: LeetCode 1509 [Search a 2D Matrix]**

**Problem Description:**
You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.

**Link to LeetCode Problem:**
https://leetcode.com/problems/search-a-2d-matrix/description/

**Thought Process**
sorting the array and then trying to minimize the difference by changing up to 3 elements, either from the start or from the end. 
iterating through the array and keep track of the minimum difference


![image](https://github.com/404reese/100DaysOfJava/assets/135740066/32436c48-8f9d-4ade-8197-9c9c913dfd15)

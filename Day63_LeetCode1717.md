**Day 63 : LeetCode 1717 [Max Score From Removing Substring]**

**Problem Description:**
You are given a string s and two integers x and y. You can perform two types of operations any number of times.

Remove substring "ab" and gain x points.
For example, when removing "ab" from "cabxbae" it becomes "cxbae".
Remove substring "ba" and gain y points.
For example, when removing "ba" from "cabxbae" it becomes "cabxe".
Return the maximum points you can gain after applying the above operations on s.

**Link to LeetCode Problem:**
https://leetcode.com/problems/maximum-score-from-removing-substrings/description/

** Thought Process **
- Using a stack to simulate removals, prioritizing substrings that yield more points (`x` for "ab" if `x >= y`, otherwise `y` for "ba").
- Iterating through the string, checking and removing valid substrings from the stack while accumulating points based on the optimal order determined by the values of `x` and `y`.
- 
![image](https://github.com/user-attachments/assets/87bb2be5-897c-45e6-9d2e-dba98097e7bb)

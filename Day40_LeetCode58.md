**Day 40: LeetCode 58 [Lenght of Last Word]**

**Problem Description:**
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.

Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.

**Link to LeetCode Problem:**
https://leetcode.com/problems/length-of-last-word/description/

**Thought Process:**
spliting the string into words using the split method, but first removing any leading or trailing spaces with trim. Then, access the last element of the resulting array and return its length

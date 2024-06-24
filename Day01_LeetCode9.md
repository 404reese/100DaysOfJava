**Day 01: LeetCode 9 [Palindrome]**

**Problem Description:**

Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 
Constraints:
-2^31 <= x <= 2^31 - 1


**Link to LeetCode Problem:**

https://leetcode.com/problems/palindrome-number/

**My Thought Process:**

- Palindromes are defined for positive values. If x is negative, immediately return false.
- Reversing Digits of x:
		> Creating a copy of x to avoid modification.
		> Using a variable revNum to store the reversed number.
		> Loop through digits of x one by one:
		> Extracting the last digit using modulo (%).
		> Appending the digit to the front of revNum by multiplying revNum by 10 and adding the digit.
		> Removing the last digit from x using integer division (/).
		> Comparing Original and Reversed Numbers:

- Comparing revNum with the original x. If they are equal, x is a palindrome (return true). Otherwise, x is not a palindrome (return false).

![WhatsApp Image 2024-05-09 at 7 56 16 PM](https://github.com/404reese/100DaysOfJava/assets/135740066/a9363264-fe22-4d1b-ab87-37151df8b85e)
  

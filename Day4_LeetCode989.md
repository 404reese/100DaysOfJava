**Day 04: LeetCode 989 [Add to Array-Form of Integer]**

**Problem Description:**
The array-form of an integer num is an array representing its digits in left to right order.

For example, for num = 1321, the array form is [1,3,2,1].
Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.

Example 1:
Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234
Example 2:
Input: num = [2,7,4], k = 181
Output: [4,5,5]
Explanation: 274 + 181 = 455
Example 3:
Input: num = [2,1,5], k = 806
Output: [1,0,2,1]
Explanation: 215 + 806 = 1021
 
Constraints:
1 <= num.length <= 104
0 <= num[i] <= 9
num does not contain any leading zeros except for the zero itself.
1 <= k <= 104

**Link to LeetCode Problem:**
https://leetcode.com/problems/add-to-array-form-of-integer/description/

**My Thought Process:**

- Initializing an empty List<Integer> called ans to store the result
- Setting two variables i and c to a.length - 1 and 0, respectively. i is used to iterate through the a array in reverse order, and c is used to keep track of the carry
- While i is greater than or equal to 0 or k is greater than 0, doing the following:
	-Calculating the sum of the current digit of a, the carry c, and the last digit of k (k % 10)
	-Calculating the new carry by dividing the sum by 10
	-Adding the remainder of the sum (s % 10) to the beginning of the ans list using the add(0, int) method
	-Updating k by dividing it by 10
	-Decrementing i by 1
-If the carry c is greater than 0, adding it to the beginning of the ans list using the add(0, int) method
-Returning the ans list as the result

![image](https://github.com/404reese/100DaysOfJava/assets/135740066/1513801c-7c25-4906-9c8e-1d9159b84145)

**Day 31: LeetCode 1491 [Average Salary]**

**Problem Description:**
You are given an array of unique integers salary where salary[i] is the salary of the ith employee.
Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.

Example 1:
Input: salary = [4000,3000,1000,2000]
Output: 2500.00000
Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500

**Link to LeetCode Problem:**
https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/description/

**Thought Process:**
for efficiency will assume min & max as 1st element then will compare element with min & max if greater or smaller than existing value will swap and simultaneouly will keep adding elements to sum
for avg = sum-min-mix / length of array - 2

![image](https://github.com/404reese/100DaysOfJava/assets/135740066/83f6a64d-2dbf-4ad3-8a7f-e9bc0f9aa018)

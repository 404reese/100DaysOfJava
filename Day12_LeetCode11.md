**Day 12: LeetCode 11 [Container with Most Water]**

**Problem Description:**
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

**Link to LeetCode Problem:**
https://leetcode.com/problems/container-with-most-water/description/

**My thought process:**
moving pointer from each side whose pointing smaller wall n cal area

**Better possible solution**
the left and right pointers are only moved when the height of the corresponding line is less than or equal to the current height. This ensures that the pointers are only moved when there is a possibility of finding a container with a larger area.
Additionally, the max area is initialized to the minimum possible integer value (Integer.MIN_VALUE), which ensures that the final answer is always correct, even if the input array contains all zeros.


![image](https://github.com/404reese/100DaysOfJava/assets/135740066/a3e1399c-2079-49ab-94d8-d5f05b2bd5f9)

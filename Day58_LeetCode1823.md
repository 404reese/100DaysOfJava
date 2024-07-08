**Day 58: LeetCode 1823 [Find the Winner of the Circular Game]**

**Problem Description:**
There are n friends that are playing a game. The friends are sitting in a circle and are numbered from 1 to n in clockwise order. More formally, moving clockwise from the ith friend brings you to the (i+1)th friend for 1 <= i < n, and moving clockwise from the nth friend brings you to the 1st friend.

The rules of the game are as follows:

Start at the 1st friend.
Count the next k friends in the clockwise direction including the friend you started at. The counting wraps around the circle and may count some friends more than once.
The last friend you counted leaves the circle and loses the game.
If there is still more than one friend in the circle, go back to step 2 starting from the friend immediately clockwise of the friend who just lost and repeat.
Else, the last friend in the circle wins the game.
Given the number of friends, n, and an integer k, return the winner of the game.

**Link to LeetCode Problem:**
https://leetcode.com/problems/find-the-winner-of-the-circular-game/description/

** Thought Process **
starting with a single friend and then iteratively add more friends to the circle, updating the winner after each addition

![image](https://github.com/404reese/100DaysOfJava/assets/135740066/38b93729-dd52-4961-b3c9-cff021dd7d15)

## Q. What is the time complexity for inserting/deleting at the beginning of the array?

O(1)
O(N)
O(logN)
O(N^2)


ANS : O(N)
Explaination:
When you insert or delete at the beginning:

    All existing elements must be shifted one position to the right (for insert) or to the left (for delete).

    This requires N operations in the worst case.

📌 Examples:
Insert at index 0:

arr = [1, 2, 3, 4]
arr.insert(0, 99)
 Result: [99, 1, 2, 3, 4]

    All elements are shifted → O(N)

Delete at index 0:

arr = [1, 2, 3, 4]
arr.pop(0)
 Result: [2, 3, 4]

    All elements are shifted → O(N)

==================

Q6. Problems on 1D Arrays-2 MCQ D

What will be the output of the following code?

class Main {
static void fun(int[]arr) {
arr[3] = 98;
return;
}

public static void main(String args[]) {
int[]arr = {10,20,30,40,50};
fun(arr);
System.out.println(arr[3]);
}
}
Option:
40

30

98

Error

ANS : 98
Explanation:

    An array arr = {10, 20, 30, 40, 50} is created in main().

    Java passes arrays by reference (actually, by value of reference), meaning the fun() method receives a reference to the same array object.

    Inside fun(arr), the 4th element (index 3) is updated to 98.

So after calling fun(arr), arr[3] is now 98.

================

### Prefix Sum Formula

The prefix sum formula for an array A of N integers is given by :-

prefSum[i] = prefSum[i] + A[i]

prefSum[i] = prefSum[i - 1] + A[i]

prefSum[i - 1] = prefSum[i] + A[i]

prefSum[i - 1] = prefSum[i - 1] + A[i]

Ans: prefSum[i] = prefSum[i - 1] + A[i]

================


Q2. Time Complexity of Prefix Sum

What is the time complexity of creating the prefix sum array of an array A of N integers ?
O(1)

O(N)

O(N^2)

O(N^3)
Ans: O(N)

==============

Q1. Prefix Sum - I

Given the prefix sum of an array, prefSum = [-2, 4, 1, 5, 2]
What is the sum of the original array from index 0 to 2 (0-based) ?

3

4

1

5
Ans : 1

================

Q2. Prefix Sum - II

Given the prefix sum of an array, prefSum = [-2, 4, 1, 5, 2]

What is the sum of the original array from index 2 to 4 (0-based) ?
2

1

-2

8
Ans: -2

================

Q3. Prefix Sum - III

Given the prefix sum of an array, prefSum = [-2, 4, 1, 5, 2]

What is the sum of the original array from index 1 to 2 (0-based) ?
5

-3

3

-5
Ans: 3

=============

Q1. Find all the subarrays

Given A = [1, -2, 5, 2, -1, 6]. Choose all the valid subarrays of the array
[5, 2, -1]

[-2, -1, 6]

[1, -2, 5, 2]

[6]

Ans: all are correct except this [-2, -1, 6]

======================

Q5. Is the bulb ON - I

Say the bulb is ON initially, after pressing the switch even number of times, what will be the final state of the bulb?

ON

OFF

Can't be determined
Ans: ON

======================
Q Is the bulb ON - II

Say the bulb is ON initially, after pressing the switch odd number of times, what will be the final state of the bulb?

ON 

OFF

Can't be determined

Ans: Off

====================

Q2. Count Subarrays starting with 'a'

Given a string A = "amazon", find the number of subarrays starting with the character 'a'.
4

6

10

12
Ans: (10 guess)
========================

Q5. Is the bulb ON - I

Say the bulb is ON initially, after pressing the switch even number of times, what will be the final state of the bulb?
ON

OFF

Can't be determined
Ans : 

=========================
Q6. Is the bulb ON - II

Say the bulb is ON initially, after pressing the switch odd number of times, what will be the final state of the bulb?
ON

OFF

Can't be determined
Ans: 
==========================




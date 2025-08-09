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

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

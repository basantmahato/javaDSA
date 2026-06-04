# 📘 The Ultimate Java Arrays Master Guide

If you want to crack FAANG, Arrays are the most tested data structure. You need to know them inside out. Here is absolutely **everything** you need to master Arrays in Java.

---

## 🧠 Part 1: Core Concepts (How Java Handles Arrays)

### 1. Memory & Fixed Size
When you create an array in Java (`int[] arr = new int[5];`), Java goes to the computer's memory (the Heap) and finds 5 blocks of space **right next to each other** (contiguous memory). 
* **Rule:** Because they are right next to each other, you **cannot resize** an array once it's created. If it's size 5, it stays size 5.

### 2. Time Complexity of Operations
* **Accessing `arr[2]`:** `O(1)` (Instant! Because of contiguous memory, the computer calculates the exact address instantly).
* **Searching for a number:** `O(N)` (You have to check every box until you find it).
* **Inserting/Deleting at the end:** `O(1)`
* **Inserting/Deleting in the middle:** `O(N)` (Because you have to shift all the other elements over to make room or fill the gap).

### 3. The "Enhanced" Array: `ArrayList`
Since standard arrays can't grow, Java provides `ArrayList`. Under the hood, it's just a normal array, but when it gets full, Java secretly creates a new array double the size, copies your old data over, and deletes the old one!
* **Syntax:** `ArrayList<Integer> list = new ArrayList<>();`

---

## 🛠️ Part 2: The 5 Core Array Patterns
To solve any array problem, you will almost always use one of these 5 techniques:

1. **Simple Traversal:** Just looping from `0` to `n-1`. (e.g., finding the max value).
2. **Two Pointers:** Using an `i` pointer at the start and a `j` pointer at the end, and moving them toward each other. (Great for reversing, or finding sums in a sorted array).
3. **Sliding Window:** Maintaining a "window" of size `K` and sliding it across the array. (Great for finding "Maximum sum of 3 consecutive elements").
4. **Prefix Sum:** Pre-calculating the sum of all elements up to index `i`. (Great for answering "What is the sum between index 2 and 5" instantly).
5. **Hashing (HashMap/HashSet):** Storing elements you've seen so far to look them up instantly later. (Great for finding pairs).

---

## 🚀 Part 3: The "Solve Everything" Question List
Work through these top-to-bottom. Do not skip the easy ones.

### Level 1: Basics (Get comfortable with loops)
- [ ] 1. Find the Largest Element in an Array
- [ ] 2. Find the Second Largest Element
- [ ] 3. Check if an Array is Sorted
- [ ] 4. Reverse an Array (In-place, without creating a new array)
- [ ] 5. Find the missing number in an array of 1 to N

### Level 2: Shifting & Modifying (Tricky logic)
- [ ] 6. Move all Zeros to the end
- [ ] 7. Left Rotate an Array by 1 place
- [ ] 8. Left Rotate an Array by D places (Try doing this in O(N) time and O(1) space!)
- [ ] 9. Remove Duplicates from a Sorted Array

### Level 3: The "Two Pointer" Magic
- [ ] 10. Two Sum (Find two numbers that add to a target)
- [ ] 11. Sort an array of 0s, 1s, and 2s (Dutch National Flag Algorithm)
- [ ] 12. Container With Most Water
- [ ] 13. Trapping Rain Water (A classic FAANG Hard problem)

### Level 4: Subarrays (Contiguous parts of an array)
- [ ] 14. Maximum Subarray Sum (Kadane's Algorithm - **MUST KNOW**)
- [ ] 15. Longest Subarray with given sum K (Positives only)
- [ ] 16. Longest Subarray with given sum K (Positives & Negatives)
- [ ] 17. Subarray Sum Equals K

### Level 5: 2D Arrays (Matrices)
- [ ] 18. Print Matrix in Spiral Pattern
- [ ] 19. Rotate Matrix by 90 Degrees
- [ ] 20. Set Matrix Zeroes
- [ ] 21. Search in a 2D Matrix

---

## 💡 How to Practice
1. **Don't just read code.** Type it out.
2. For every problem, write down the **Time Complexity** (how fast it is) and **Space Complexity** (how much extra memory it uses).
3. Always try the "Brute Force" (slowest but easiest) way first, then figure out how to optimize it using one of the 5 patterns above.

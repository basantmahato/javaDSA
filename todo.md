# 🚀 The Ultimate 2-Month DSA Master Sheet

Welcome to your personal DSA Tracker! I have broken down the entire world of Data Structures and Algorithms into bite-sized, easy-to-understand pieces. Imagine DSA as a huge video game. Each topic is a "World", subtopics are "Levels", and questions are the "Bosses" you need to defeat. 

Whenever you solve a problem, come here and put an `x` in the box like this: `- [x]`.

---

## 🌎 World 1: Time & Space Complexity (The Rules of the Game)
* **What is it?** Before we play, we need to know how to measure if our code is fast (Time) or taking up too much memory (Space).
* **Microtopics:** Big-O notation, Best/Worst/Average case.

### Boss Fights:
- [ ] Understand what `O(1)`, `O(n)`, `O(n^2)`, and `O(log n)` mean.
- [ ] Calculate the time complexity of a single `for` loop.
- [ ] Calculate the time complexity of two nested `for` loops.
- [ ] Calculate the time complexity of Binary Search.

---

## 🌎 World 2: Arrays (The Line of Boxes)
* **What is it?** Imagine a row of lockers, each with a number. You can put one item in each locker. Arrays are just a line of boxes in your computer's memory to store data.

### Level 2.1: Basic Operations (Walking the Line)
- [ ] Find the largest element in an array
- [ ] Find the second largest element
- [ ] Check if the array is sorted
- [ ] Remove duplicates from a sorted array
- [ ] Left rotate an array by one place
- [ ] Left rotate an array by `D` places
- [ ] Move all zeros to the end

### Level 2.2: Two Pointers (Using Two Hands)
* **What is it?** Instead of looking at one box at a time, you use two fingers pointing at different boxes (usually the start and the end) and move them towards each other.
- [ ] Two Sum (Find if two numbers add up to a target)
- [ ] Sort an array of 0s, 1s, and 2s (Dutch National Flag Algorithm)
- [ ] Reverse an array using two pointers
- [ ] Container With Most Water
- [ ] Trapping Rain Water

### Level 2.3: Prefix Sum (Keeping a Running Total)
* **What is it?** Imagine keeping a running total of your money every day, so if someone asks "how much did you make between Tuesday and Friday?", you can answer instantly without adding it all up again.
- [ ] Running sum of 1D Array
- [ ] Find Equilibrium Index of an Array
- [ ] Subarray Sum Equals K

### Level 2.4: Sliding Window (A Moving Frame)
* **What is it?** Imagine looking through a small window at a long picture. You slide the window to the right to see the next part. Useful for finding longest/shortest subarrays.
- [ ] Maximum sum subarray of size K
- [ ] Longest Subarray with sum K
- [ ] Longest Substring Without Repeating Characters

### Level 2.5: 2D Arrays / Matrices (A Grid of Boxes)
* **What is it?** A grid, like a chessboard or an Excel sheet.
- [ ] Set Matrix Zeros
- [ ] Rotate Image / Matrix by 90 degrees
- [ ] Spiral Matrix Traversal
- [ ] Search in a 2D Matrix

---

## 🌎 World 3: Strings (Words and Sentences)
* **What is it?** A string is just an array where all the boxes hold letters (characters) instead of numbers.

### Level 3.1: Basics & Manipulations
- [ ] Reverse a String
- [ ] Check if a String is a Palindrome (reads the same forwards and backwards)
- [ ] Valid Anagram (Do two words have the exact same letters?)
- [ ] Find the first non-repeating character

---

## 🌎 World 4: Searching & Sorting (Finding and Arranging)
* **What is it?** Searching is looking for a specific item. Sorting is arranging items from smallest to largest.

### Level 4.1: Binary Search (The Dictionary Method)
* **What is it?** If you are looking for "Monkey" in a dictionary, you don't read page 1, page 2... You open the middle! If you see "P", you know "M" is in the first half. You keep splitting it in half. **The array MUST be sorted for this to work.**
- [ ] Standard Binary Search
- [ ] Find First and Last Position of Element in Sorted Array
- [ ] Search Insert Position
- [ ] Find Minimum in Rotated Sorted Array
- [ ] Search in Rotated Sorted Array
- [ ] Find Peak Element

### Level 4.2: Binary Search on Answer (Advanced Magic)
* **What is it?** Sometimes the answer itself is a number, and we can use Binary Search to guess the answer, checking if our guess is possible.
- [ ] Koko Eating Bananas
- [ ] Minimum Number of Days to Make m Bouquets
- [ ] Allocate Books
- [ ] Aggressive Cows

### Level 4.3: Sorting Algorithms
- [ ] Implement Selection Sort
- [ ] Implement Bubble Sort
- [ ] Implement Insertion Sort
- [ ] Implement Merge Sort (Divide and Conquer!)
- [ ] Implement Quick Sort

---

## 🌎 World 5: Linked Lists (The Scavenger Hunt)
* **What is it?** Unlike arrays (lockers next to each other), Linked Lists are scattered boxes. But every box has a piece of paper telling you where the next box is hidden!

### Level 5.1: Singly Linked List (One-Way Clues)
- [ ] Reverse a Linked List
- [ ] Middle of the Linked List
- [ ] Merge Two Sorted Lists
- [ ] Remove Nth Node From End of List

### Level 5.2: Fast and Slow Pointers (The Tortoise and Hare)
* **What is it?** You have two pointers. One moves 1 step at a time, the other moves 2 steps. Used to find cycles (loops) or the middle!
- [ ] Linked List Cycle (Detect a loop)
- [ ] Find the starting point of the cycle
- [ ] Palindrome Linked List

---

## 🌎 World 6: Stacks & Queues (Pancakes and Lines)
* **Stack:** Like a stack of pancakes. The last pancake you put on top is the first one you eat (LIFO - Last In First Out).
* **Queue:** Like a line at a ticket counter. The first person in line is the first one served (FIFO - First In First Out).

### Level 6.1: Stack Basics
- [ ] Implement Stack using Arrays
- [ ] Valid Parentheses (Matching brackets)
- [ ] Min Stack (A stack that can always tell you its smallest item instantly)

### Level 6.2: Monotonic Stack (A Sorted Stack)
- [ ] Next Greater Element I
- [ ] Daily Temperatures
- [ ] Largest Rectangle in Histogram

### Level 6.3: Queue Basics
- [ ] Implement Queue using Arrays
- [ ] Implement Stack using Queues
- [ ] Sliding Window Maximum

---

## 🌎 World 7: Trees (The Family Tree)
* **What is it?** Data branching out like a real tree (but upside down). You have a root at the top, and branches going down to "leaves".

### Level 7.1: Traversals (Ways to visit every branch)
- [ ] Inorder Traversal (Left, Root, Right)
- [ ] Preorder Traversal (Root, Left, Right)
- [ ] Postorder Traversal (Left, Right, Root)
- [ ] Level Order Traversal (BFS - going level by level)

### Level 7.2: Depth and Properties
- [ ] Maximum Depth of Binary Tree
- [ ] Balanced Binary Tree
- [ ] Diameter of Binary Tree
- [ ] Same Tree
- [ ] Symmetric Tree

### Level 7.3: Binary Search Tree (BST)
* **What is it?** A special tree where everything to the left is smaller, and everything to the right is bigger. Great for fast searching!
- [ ] Search in a Binary Search Tree
- [ ] Insert into a Binary Search Tree
- [ ] Delete Node in a BST
- [ ] Validate Binary Search Tree
- [ ] Lowest Common Ancestor of a BST

---

## 🌎 World 8: Heaps / Priority Queues (The VIP Line)
* **What is it?** Imagine a queue where the most "important" (or largest/smallest) person always jumps to the front.
- [ ] Kth Largest Element in an Array
- [ ] Top K Frequent Elements
- [ ] Merge K Sorted Lists
- [ ] Find Median from Data Stream

---

## 🌎 World 9: Graphs (The Map of Cities)
* **What is it?** A bunch of cities (Nodes/Vertices) connected by roads (Edges).

### Level 9.1: Traversal Basics
- [ ] Breadth-First Search (BFS) - Exploring layer by layer
- [ ] Depth-First Search (DFS) - Exploring as deep as possible first

### Level 9.2: Connected Components & Islands
- [ ] Number of Islands
- [ ] Max Area of Island
- [ ] Rotting Oranges
- [ ] Surrounded Regions

### Level 9.3: Advanced Graph Magic
- [ ] Course Schedule (Topological Sort)
- [ ] Network Delay Time (Dijkstra's Algorithm - Shortest Path)

---

## 🌎 World 10: Dynamic Programming (Remembering the Past)
* **What is it?** "Those who cannot remember the past are condemned to repeat it." DP is just recursion (calling a function inside itself) but we write down the answers in a notebook so we never have to calculate the same thing twice.

### Level 10.1: 1D DP (Linear Notebooks)
- [ ] Climbing Stairs
- [ ] Min Cost Climbing Stairs
- [ ] House Robber
- [ ] House Robber II

### Level 10.2: 2D DP (Grid Notebooks)
- [ ] Unique Paths
- [ ] Unique Paths II
- [ ] Minimum Path Sum

### Level 10.3: DP on Strings / Sequences
- [ ] Longest Common Subsequence
- [ ] Longest Increasing Subsequence
- [ ] Edit Distance

---

## 🏆 Final Bosses: Bit Manipulation & Math
* **What is it?** Playing directly with 0s and 1s, and basic math tricks.
- [ ] Number of 1 Bits
- [ ] Missing Number
- [ ] Reverse Bits
- [ ] Single Number

---

*This sheet contains around 100 highly-curated foundational problems. While it's not 300 yet, conquering these specific problems will give you the exact same knowledge as solving 300 random ones because these are the "Pattern Parents". Master these, and you master everything!*

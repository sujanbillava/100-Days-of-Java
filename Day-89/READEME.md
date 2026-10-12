# Day 89: Backtracking Basics in Java

 **Backtracking** in Java. Backtracking is a problem-solving technique that explores different choices to find possible solutions.

## 🎯 What Is Backtracking?
Backtracking is a technique in which we:
1. Make a choice.
2. Explore the result of that choice.
3. Check whether the solution is complete.
4. Return and explore another choice when necessary.

Backtracking is commonly implemented using recursion.

## 🧠 Concepts Learned
- Backtracking fundamentals
- Recursive function calls
- Base conditions
- Exploring multiple choices
- Generating binary strings
- Understanding the recursion tree



## 🌍 Applications of Backtracking
- Maze solving
- Sudoku solving
- Generating permutations
- N-Queens problem
- Generating combinations


- **Time Complexity:** O(n × 2ⁿ), because there are 2ⁿ strings and each string has length n.
- **Auxiliary Space Complexity:** O(n) for the recursion depth, excluding the space required to store or display the output.

## 📚 Key Takeaways
- Backtracking explores different possible choices.
- Recursion helps explore each branch.
- A base condition stops a branch when a complete solution is found.
- This program generates all binary strings of the required length.
- In this example, new strings are created at every recursive call, so no explicit undo operation is needed.


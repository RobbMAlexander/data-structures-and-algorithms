# Code Challenge 26: Insertion Sort

## Whiteboard Image

This code challenge was conducted as a blog post describing the provided pseudocode for an insertion sort algorithm (Original pseudocode is [Here](https://canvas.instructure.com/courses/4190372/assignments/27795787)).
Post is provided [Here](src\main\java\code-challenge-26\BLOG.md).

## Approach & Efficiency

This approach iterates through the array (of integers), comparing 

### Space Efficiency

Space efficiency is O(1): only the temporary variable must be stored (beyond the provided array), and it is reassigned between iterations.

### Time Efficiency

Time efficiency is O(n^2): In some "messier" cases, most values must be compared against most other values, leading to exponential scaling.

## Solution

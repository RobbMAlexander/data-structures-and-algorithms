# Code Challenge 28: Quick Sort

## Whiteboard Image

This code challenge was conducted as a blog post describing the provided pseudocode for a merge sort algorithm (Original pseudocode is [Here](https://canvas.instructure.com/courses/4190372/assignments/27795789)).
Post is provided [Here](code-challenge-28\BLOG.md).

## Approach & Efficiency

This approach recursively selects the highest index value of an array (of integers) and divides the array into two sub-arrays depending on comparison to high index until the resulting 1 or 2-index arrays constitute a sorted version of the original array.

### Space Efficiency

Space efficiency is O(1): Other than a single temporary variable used to hold a value during "swaps," the entirety of the process may be done in place within recursively shrinking bounds of indexes in the original array.

### Time Efficiency

Time efficiency is O(n^2): Time will scale with the size of the input nonlinearly, as each value added may lead to an additional level of recursive sorting.

## Solution

[Code is available here]() WIP

# Code Challenge 27: Merge Sort

## Whiteboard Image

This code challenge was conducted as a blog post describing the provided pseudocode for a merge sort algorithm (Original pseudocode is [Here](https://canvas.instructure.com/courses/4190372/assignments/27795788)).
Post is provided [Here](code-challenge-27\BLOG.md).

## Approach & Efficiency

This approach recursively halves an array (of integers), until comparing the remaining values and assigning indexes of the output array in the ascending value order. If at any point only one sorted array remains, the remaining output array indexes are assigned to those of this remaining array.

### Space Efficiency

Space efficiency is O(n): Each variable must be assigned within the temporary sorting structures, so the maximum concurrent size will scale linearly with the array length.

### Time Efficiency

Time efficiency is O(n): Time will scale with the size of the input.

## Solution

[Code is available here]()

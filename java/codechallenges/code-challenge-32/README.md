# Code Challenge 32: treeIntersection

Robb Alexander - 03/29/2022

## Challenge Overview

* To write a function that will take in two binary trees as arguments and returns a list of all values that appear in both trees via an intermediate hash map.

### Approach

[Whiteboard](/code-challenge-32-whiteboard.png)

* My approach iterates through one tree to 

### Efficiency

* Space: O(n) -- If at least one tree is not null, the hash map must contain all elements of the first tree, and the list to be returned will contain as many as all elements of both trees (if identical values).

* Time: O(n) -- Regardless of the number of duplicates, all elements must be iterated over.

### API

`treeIntersection()` : Takes two binary trees as arguments, returns an array list of values found in both trees (currently, once per incidence in second tree).
If either tree is empty, throws IOException.

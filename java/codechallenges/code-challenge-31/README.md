# Code Challenge 31: repeatedWord

Robb Alexander - 03/28/2022

## Challenge Overview

* To write a function that will take in a string and return the first repeated word within it by storing sub-strings in a hash map.

### Approach

[Whiteboard](/code-challenge-31-whiteboard.png)

* My approach

### Efficiency

* Space: O(n) -- In the worst case, the hash map will contain all but the last sub-string to hold for comparisons.

* Time: O(n) -- In the worst case, all sub-strings will have to be iterated through to confirm that no duplicate words are present.

### API

`repeatedWord()` : Takes a String as an argument, returns the sub-string (divided by spaces) that first occurs more than once in the format: `First duplicated word: [returned string here]`
If no such sub-strings are found, returns: `No duplicate words found`.

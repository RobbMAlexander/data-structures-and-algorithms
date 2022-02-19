# Data Structures

## Implementation Notes

### Code Challenge 05: Singly Linked List

02/18/2022
Wrote class `LinkedList` composed of nodes holding values and a `next` property referring to subsequent node.
Wrote three methods (in "API", below) for insertion of nodes into a LinkedList, returning a boolean for input value's presence in the LinkedList, and string output of nodes in a LinkedList.

#### Challenge

To implement a singly-linked list along with methods for insertion, boolean value search, and to-string functionality, then test each.

#### Approach & Efficiency

For `insert()`, after checking for the condition of no existing nodes, I used the defined `next` property to assign the new node instance's `next` property to the previous `head`, then assigned `head` to the newly instantiated node (if no existing nodes were present, `head` is immediately assigned).

* Spatial O(1): Efficiency is at constant magnitude due to lack of scaling based on input value.

* Temporal O(1): Efficiency is at constant magnitude due to variable count not scaling based on input value.

For `includes()`, return variable defaults to `false`. After checking for the condition of no existing nodes, a new variable is assigned to sequential node's element values (until node's reference value is null), and equality to input is checked. If equal value is found, returned variable is set to `true`.

* Spacial O(1): Only two variables are used, regardless of input value.

* Temporal O(n): In worst case all nodes must be checked, so time scales with list length.

For the `toString()` override, I used a single string variable that was iteratively (via `while` loop terminating after "tail" node was reached) contatenated with some formatting characters around the value of the element held by each node, followed by the "NULL" indication of the tail node's reference. A second variable was used for value assignments during iteration.

* Spacial O(1): Returned variable count does not scale with list length (though string length does linearly).

* Temporal O(n): In all cases, each node must be accessed.

#### API

Method: `insert(int value)`

* Functionality: Creates an additional node at head of list holding element with value of argument integer. Public method with no expected return.

Method: `includes(int value)`

* Functionality: Searches list for presence of a node holding elements of value equal to argument integer. Public method with boolean return.

Method: `toString`

* Functionality: Public `toString` method override with string return. String uses format: "{ element1 value } -> { element2 value } -> NULL" for each element, ending in null reference from tail node.

## Code Challenges

### Challenge 01

Location: `codechallenges/linkedlist/LinkedListChallenges`

Method: `linkedListChallenge06()`

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

### Code Challenge 06: Linked List Insertion Methods
02/21/2022
Wrote three additional methods in LinkedList class: `append()`; `insertBefore()`; `insertAfter()` and some accompanying tests (WIP)


#### Challenge
To implement methods for inserting nodes into linked lists at: the tail; before a given element's value; after a given element's value.

#### Approach & Efficiency
(WIP-- some methods still pending tests)

#### API

Method: `append(int value)`

* Functionality: Inserts additional node at tail of list holding element with value of argument integer. Public method with no expected return.

Method: `insertBefore(int value, int newValue)`

* Functionality: Inserts additional node before node holding element with argument value; new node holds element with value of argument integer "newValue". Public method with no expected return.

Method: `insertAfter(int value, int newValue)`

* Functionality: Inserts additional node after node holding element with argument value; new node holds element with value of argument integer "newValue". Public method with no expected return.

### Code Challenge 15: Binary Trees
03/4/2022
Wrote class for BinaryTree and subclass BinarySearchTree along with basic methods.

#### Challenge
To create a class for a binary tree with traversal methods for pre-order, in order, and post-order.
To create a class for a binary search tree with methods for addition of nodes and to check for an existing node holding an input value.

#### Approach & Efficiency
(WIP-- some methods still pending tests)

#### API

Method: `append(int value)`

* Functionality: Inserts additional node at tail of list holding element with value of argument integer. Public method with no expected return.

Method: `insertBefore(int value, int newValue)`

* Functionality: Inserts additional node before node holding element with argument value; new node holds element with value of argument integer "newValue". Public method with no expected return.

Method: `insertAfter(int value, int newValue)`

* Functionality: Inserts additional node after node holding element with argument value; new node holds element with value of argument integer "newValue". Public method with no expected return.

Method: `insertBefore(int value, int newValue)`

* Functionality: Inserts additional node before node holding element with argument value; new node holds element with value of argument integer "newValue". Public method with no expected return.

Method: `insertAfter(int value, int newValue)`

* Functionality: Inserts additional node after node holding element with argument value; new node holds element with value of argument integer "newValue". Public method with no expected return.

### Code Challenge 30: Hash Tables
3/25/22
* Wrote class for HashMap and HashMapPair, along with several methods for HashMap.

#### Challenge
To create a class for hash map functionality: storing key-value pairs inside an array-like structure using sub-structures at each index.

#### Approach & Efficiency

#### API

Method: `set()`
* Functionality: Takes an argument Key and an argument Value to insert into the calling HashMap (nothing returned).

Method: `get()`
* Functionality: Takes an argument Key and returns the first value paired with that key within the calling HashMap.

Method: `contains()`
* Functionality: Takes an argument Key and returns a boolean for presence of that key within calling HashMap.

Method: `keys()`
* Functionality: Returns a list of all Key present within calling HashMap (no arguments).

### Code Challenge 35: Graph
4/1/22
* Wrote classes for Graph, Vertex, and Edge; wrote several methods for structure functionality.

#### Challenge
To create a class for list-linked graph functionality: storing a hash map of respective linked lists for each vertex, with each linked list holding a series of edges with references to the neighboring vertex (and weight as applicable)

#### Approach & Efficiency

#### API

Method: `addVertex()`
* Functionality: Takes an argument Vertex and creates a new row for it in the hash map; Increments vertexCount field; returns added Vertex if not already present in graph

Method: `addEdge()`
* Functionality: Takes in two argument Vertex 's and an optional `weight` property for the added Edge; No return.

Method: `getVertices()`
* Functionality: Returns a LinkedList of all the Vertex 's within the calling Graph.

Method: `getNeighbors()`
* Functionality: Takes an argument Vertex and returns a LinkedList of the Edge 's for that Vertex.

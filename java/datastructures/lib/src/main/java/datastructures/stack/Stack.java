package datastructures.stack;

import datastructures.stack.Node;

public class Stack<T>
{
  Node<T> top;

  void push(T value)
  {
    Node pushedNode = new Node(value);
    //1+ existing nodes condition
    if (top != null) {
      pushedNode.next = top;
    }
    top = pushedNode;
  }

  T pop()
  {
   T topValue;
   topValue = top.value;
   top = top.next;
    return topValue;
  }

  T peek()
  {
    return top.value;
  }

  boolean isEmpty()
  {
    if (top == null) {
      return true;
    } else {
      return false;
    }
  }
}

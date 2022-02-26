package datastructures.queue;

import datastructures.queue.Node;

public class Queue<T>
{
  Node<T> front;
  Node<T> back;

  void enqueue(T value)
  {
    Node newBackNode = new Node(value);
    newBackNode.next = back;
    back = newBackNode;
  }

  T dequeue()
  {
    T frontValue = front.value;
    front = front.next;
    return frontValue;
  }

  T peek()
  {
    return front.value;
  }

  boolean isEmpty()
  {
    if (front == null) {
      return true;
    } else {
      return false;
    }
  }
}

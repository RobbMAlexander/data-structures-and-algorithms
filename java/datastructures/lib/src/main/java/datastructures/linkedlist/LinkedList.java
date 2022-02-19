package datastructures.linkedlist;

public class LinkedList {
  Node head = null;
  Node tail = null;  // not truly required, but can be useful

  public void insert(int value) {
    Node insertedNode = new Node(value);

      // 1+ existing nodes condition
    if (head != null) {
      insertedNode.next = head;
    }
    // if 0 existing nodes, skips here
    head = insertedNode;
  }

  public boolean includes(int value) {
    boolean includesStatus = false;

    // 0 existing nodes
    if (head == null) {
      System.err.println("No list found.");
    }
    //1+ existing nodes
    Node checkedNode = head;

    while (checkedNode.next != null)
      if (value == checkedNode.value) {
        includesStatus = true;
        break;
      } else {
        checkedNode = checkedNode.next;
      }
    return includesStatus;
  }

  @Override
  public String toString() {
    // 0 existing nodes
    String listString = "";
    if (head == null) {
      listString = "No list found";
    } else {
      //2+ existing nodes
      Node strungNode = head;
      while (strungNode.next != null) {
        listString += "{" + strungNode.value + "} -> ";
        strungNode = strungNode.next;
      }
      //1 existing node
      listString += "{" + strungNode.value + "} -> NULL";
    }
    return listString;
  }

}

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

  public void append(int value) {
    Node appendedNode = new Node(value);
    // 0 existing nodes
    if (head == null) {
      head = appendedNode;
    } else {
      // 2+ existing nodes
      Node checkedNode = head;
      while (checkedNode.next != null) {
        checkedNode = checkedNode.next;
      }
      // 1 existing node starts here
      checkedNode.next = appendedNode;
    }
  }

  public void insertBefore(int value, int newValue) {
    // check for 0 existing nodes
    primaryLoop : if (head == null) {
      System.err.println("No nodes found in list.");
    } else {
      //1+ nodes
      Node insertedNode = new Node(newValue);
      Node checkedNode = head;
      while (checkedNode.next != null) {
        if (checkedNode.next.value == value) {
          Node newReference = checkedNode.next;
          checkedNode.next = insertedNode;
          insertedNode.next = newReference;
          break primaryLoop;
        } else {
          checkedNode = checkedNode.next;
        }
      }
      // not found condition
      System.err.println("No matching element value found.");
    }
  }

  public void insertAfter(int value, int newValue) {
    // check for 0 existing nodes
    primaryLoop:
    if (head == null) {
      System.err.println("No nodes found in list.");
    } else {
      //1+ nodes
      Node insertedNode = new Node(newValue);
      Node checkedNode = head;
      while (checkedNode != null) {
        if (checkedNode.value == value) {
          insertedNode.next = checkedNode.next;
          checkedNode.next = insertedNode;
          break primaryLoop;
        } else {
          checkedNode = checkedNode.next;
        }
      }
      // not found condition
      System.err.println("No matching element value found.");
    }
  }

}

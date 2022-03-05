package datastructures.tree;

public class BinarySearchTree extends BinaryTree {

  public void add(int value) {
    Node checkedNode = root;

    while (checkedNode.value != value)
      if (value > checkedNode.value) {
        if (checkedNode.rightNode == null) {
          checkedNode.rightNode = new Node(value);
          break;
        } else {
          checkedNode = checkedNode.rightNode;
        }
      } else {
        if (checkedNode.leftNode == null) {
          checkedNode.leftNode = new Node(value);
          break;
        } else {
          checkedNode = checkedNode.leftNode;
        }

      }

  }

  public boolean contains(int value) {
    Node checkedNode = root;
    while (checkedNode.leftNode != null
      || checkedNode.rightNode != null)
      if (value == checkedNode.value) {
        return true;
      } else if (value > checkedNode.value) {
        if (checkedNode.rightNode != null) {
          checkedNode = checkedNode.rightNode;
        } else {
          return false;
        }
      } else {
        if (checkedNode.leftNode != null) {
          checkedNode = checkedNode.leftNode;
        } else {
          return false;
        }
      }
    return false;
  }


}

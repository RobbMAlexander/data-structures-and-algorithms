package codechallenges.TreeIntersection;

import datastructures.stack.Stack;
import datastructures.tree.BinaryTree;
import datastructures.hashmap.HashMap;
import datastructures.tree.Node;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TreeIntersection {
  public <T> List treeIntersection(BinaryTree t1, BinaryTree t2) throws IOException {
    if (t1.root == null || t2.root == null) {
      throw new IOException("Failed to compare -- neither tree should be empty");
    } else {
      List<T> dupeList = new ArrayList<>();
      HashMap<T, String> dupeMap = new HashMap<>(10);
      List<T> t1Arr = t1.preOrderTraversal();
      for (T t1Value : t1Arr) {
        dupeMap.set(t1Value, t1Value.toString());
      }
      Stack<datastructures.tree.Node> t2TraversalStack = new Stack<>();
      t2TraversalStack.push(t2.root);
      while (!t2TraversalStack.isEmpty()) {
        Node checkedNode = t2TraversalStack.pop();
        //TODO: condition adding to dupeList on value not existing there
        if (dupeMap.contains((T) checkedNode.value)) {
          dupeList.add((T) checkedNode.value);
        }
        if (checkedNode.rightNode != null) {
          t2TraversalStack.push(checkedNode.rightNode);
        }
        if (checkedNode.leftNode != null) {
          t2TraversalStack.push(checkedNode.leftNode);
        }
      }
      return dupeList;
    }
  }
}

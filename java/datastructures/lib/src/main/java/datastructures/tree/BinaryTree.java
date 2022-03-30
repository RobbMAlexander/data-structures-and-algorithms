package datastructures.tree;

import datastructures.stack.Stack;
import java.util.ArrayList;


public class BinaryTree<T> {

  public Node root;

  public ArrayList<T> preOrderTraversal(){

    ArrayList<T> valueList = new ArrayList<>();
    Stack<Node> traversalStack = new Stack<>();
   traversalStack.push(root);
    while (!traversalStack.isEmpty()) {
      Node checkedNode = traversalStack.pop();
      valueList.add((T) checkedNode.value);
      //right node checked/pushed first, so left will be popped first
      if (checkedNode.rightNode != null) {
        traversalStack.push(checkedNode.rightNode);
      }
      if (checkedNode.leftNode != null) {
        traversalStack.push(checkedNode.leftNode);
      }
    }
    ArrayList<T> outputValues = new ArrayList<>();
//    outputValues = valueList.toArray(outputValues);
    return outputValues;
  }

  public Integer[] inOrderTraversal(){
    ArrayList<Integer> valueList = new ArrayList<>();



    Integer[] outputValues = new Integer[valueList.size()];
    outputValues = valueList.toArray(outputValues);
    return outputValues;
  }

  public Integer[] postOrderTraversal(){
    ArrayList<Integer> valueList = new ArrayList<>();



    Integer[] outputValues = new Integer[valueList.size()];
    outputValues = valueList.toArray(outputValues);
    return outputValues;
  }

}

package datastructures.tree;

public class Node<T>
{
  public T value;
  public Node leftNode = null;
  public Node rightNode = null;

  public Node(T value)
  {
    this.value = value;
  }

}

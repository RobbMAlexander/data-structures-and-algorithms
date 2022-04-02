package datastructures.graph;

public class Edge<T extends Comparable<? super T>> implements Comparable<Vertex<T>> {
  public Vertex<T> destination;
  public int weight;


  public Edge(Vertex<T> destination) {
    this.destination = destination;
  }

  public Edge(Vertex<T> destination, int weight) {
    this.destination = destination;
    this.weight = weight;
  }

  @Override
  public int compareTo(Vertex<T> o) {
    //TODO write exception note
    throw new UnsupportedOperationException("Edge NOPE");
  }


}

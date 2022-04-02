package datastructures.graph;

import datastructures.hashmap.HashMap;
import datastructures.hashmap.HashMapPair;
import datastructures.linkedlist.Node;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph <T extends Comparable<? super T>> implements Comparable<Graph<T>> {

  public HashMap<Vertex<T>, LinkedList<Edge<T>>> adjacencyLists;
  private int vertexCount;

  public Graph(int maxNumberOfVertices){
    adjacencyLists = new HashMap<>(maxNumberOfVertices);
  }

  public Vertex<T> addVertex(T value){
      Vertex<T> addedVertex = new Vertex<T>(value);
    if (!adjacencyLists.contains(addedVertex)) {
      LinkedList<Edge<T>> addedList = new LinkedList<>();
      adjacencyLists.set(addedVertex, addedList);
      vertexCount++;
      return addedVertex;
    }
    return null;
  }

  public void addEdge(Vertex<T> origin, Vertex<T> destination) throws IOException {
    addEdge(origin, destination, 0);
  }

  public void addEdge (Vertex<T> origin, Vertex<T> destination, int  weight) throws IOException {
    if(!adjacencyLists.contains(origin)){
      addVertex(origin.value);
    }
    Edge<T> destEdge = new Edge<>(destination, weight);
    adjacencyLists.get(origin).push(destEdge);

  }

  public LinkedList<Vertex<T>> getVertices(){
    LinkedList<Vertex <T>> verticesList = new LinkedList<>();
    for (LinkedList<HashMapPair<Vertex<T>, LinkedList<Edge<T>>>> list : adjacencyLists.bucketArrayList){
      //TODO refactor for enhanced for loop w/ `Node vertexNode : list` ?
      for (int i = 0; i < list.size(); i++) {
      verticesList.add(list.get(i).getKey());
      }
    }
    return verticesList;
  }

  public LinkedList<Edge<T>> getNeighbors(Vertex<T> vertex) throws IOException {

    return adjacencyLists.get(vertex);
  }

  public int size(){
    return vertexCount;
  }

  @Override
  public int compareTo(Graph<T> o){
    //TODO write exception message
    throw new UnsupportedOperationException("Graph NOPE");
  }

  /*
  @Override
  public String toString() {

    return "";
  }
*/

}

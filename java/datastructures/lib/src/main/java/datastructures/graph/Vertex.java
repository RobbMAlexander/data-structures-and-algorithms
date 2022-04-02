package datastructures.graph;

import java.util.Objects;

public class Vertex<T extends Comparable<? super T>> implements Comparable<Vertex<T>> {

  T value;

  public Vertex(T value) {
    this.value = value;
  }

  @Override
  public int compareTo(Vertex<T> o) {
    //TODO write exception message
    throw new UnsupportedOperationException("Vert NOPE");
  }

  // TODO implement ID system for use of duplicates?
  @Override
  public boolean equals(Object object) {
    if (this == object) return true;
    if (object == null || getClass() != object.getClass()) return false;
    Vertex<?> vertex = (Vertex<?>) object;
    return Objects.equals(value, vertex.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

}

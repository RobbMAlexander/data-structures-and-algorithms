package datastructures.hashmap;


import datastructures.linkedlist.Node;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashMap<Key, Value> {
  ArrayList<LinkedList<HashMapPair<Key, Value>>> bucketArrayList;
  int size;

  public HashMap(int size) {
    if (size < 1) {
      throw new IllegalArgumentException("Invalid size: must be integer 1 or greater");
    }

    this.size = size;
    this.bucketArrayList = new ArrayList<>(size);

    for (int i = 0; i < this.size; i++) {
      bucketArrayList.add(i, new LinkedList<>());
    }

  }

  public void set(Key key, Value value) {
    HashMapPair<Key, Value> addedPair = new HashMapPair<>(key, value);
    LinkedList<HashMapPair<Key, Value>> setList = bucketArrayList.get(hash(key));
    for (int i = 0; i < setList.size(); i++) {
      if (setList.get(i).getKey() == key) {
        setList.remove(i);
        setList.add(addedPair);
        return;
      }
    }
    setList.add(addedPair);
  }

  public Value get(Key key) throws IOException {
    LinkedList<HashMapPair<Key, Value>> getList = bucketArrayList.get(hash(key));
    for (int i = 0; i < getList.size(); i++) {
      if (getList.get(i).getKey() == key) {
        return getList.get(i).getValue();
      }
    }
    throw new IOException ("No such key in map");
  }

  public boolean contains(Key key) {
    LinkedList<HashMapPair<Key, Value>> containsList = bucketArrayList.get(hash(key));
    for (int i = 0; i < containsList.size(); i++ ) {
      if (containsList.get(i).getKey() == key) {
        return true;
      }
    }
    return false;
  }

  public List<Key> keys() {
    List<Key> keyList = new ArrayList<>();
    for (int i = 0; i < bucketArrayList.size(); i++) {
      LinkedList<HashMapPair<Key, Value>> readList = bucketArrayList.get(i);
      for (int j = 0; j < readList.size(); i++) {
        keyList.add(readList.get(j).getKey());
      }
    }
    return keyList;
  }

  public int hash(Key key) {
    return Math.abs(key.hashCode()) % size;
  }

}

package com.algorithm.datastructure.hash;

import java.util.LinkedList;

class HashTable {
  class Node {
    String key;
    String value;

    public Node(String key, String value) {
      this.key = key;
      this.value = value;
    }

    String value() {
      return value;
    }

    void value(String value) {
      this.value = value;
    }

  }

  LinkedList<Node>[] data; // Node를 담는 LinkedList를 담는 배열 data

  HashTable(int size) {
    this.data = new LinkedList[size];
  }

  int getHashCode(String key) {
    int hashCode = 0;

    for (char character : key.toCharArray()) {
      hashCode += character;
    }
    return hashCode;
  }

  int convertToIndex(int hashCode) {
    return hashCode % data.length;
  }

  Node searchKey(LinkedList<Node> nodes, String key) {
    if (nodes == null) {
      return null;
    }

    for (Node node : nodes) {
      if (node.key.equals(key)) {
        return node;
      }
    }
    return null;
  }

  void put(String key, String value) {
    int hashCode = getHashCode(key);
    int index = convertToIndex(hashCode);
    LinkedList<Node> nodes = data[index];

    if (nodes == null) {
      nodes = new LinkedList<>();
      data[index] = nodes;
    }

    Node node = searchKey(nodes, key);
    if (node == null) {
      nodes.addLast(new Node(key, value));
    } else {
      node.value(value);
    }
  }

  String get(String key) {
    int hashCode = getHashCode(key);
    int index = convertToIndex(hashCode);

    LinkedList<Node> nodes = data[index];
    Node node = searchKey(nodes, key);
    return node == null ? "Not found" : node.value;
  }
}
public class HashTableExample {
  public static void main(String[] args) {
    HashTable hashTable = new HashTable(3);

    hashTable.put("park", "박지성");
    hashTable.put("son", "손흥민");
    hashTable.put("kim", "김연아");
    hashTable.put("lee", "이광수");
    hashTable.put("yoo", "유재석");
    hashTable.put("yoo", "유인나");

    System.out.println(hashTable.get("park"));
    System.out.println(hashTable.get("son"));
    System.out.println(hashTable.get("kim"));
    System.out.println(hashTable.get("lee"));
    System.out.println(hashTable.get("yoo"));
  }
}

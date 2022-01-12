package com.algorithm.datastructure;

class Node {
  private String data;
  public Node link;

  public Node(String data) {
    this.data = data;
    this.link = null;
  }

  public Node(String data, Node link) {
    this.data = data;
    this.link = link;
  }

  public String getData() {
    return this.data;
  }
}

class LinkedList {

  private Node head;

  public LinkedList() {
    this.head = null;
  }

  public void add(Node preNode, String data) {
    Node newNode = new Node(data);

    newNode.link = preNode.link;
    preNode.link = newNode;

  }

  public void add(String data) {
    Node newNode = new Node(data);
    if (this.head == null) {
      this.head = newNode;
    } else {
      Node tempNode = head;

      while (tempNode.link != null) {
        tempNode = tempNode.link;
      }

      tempNode.link = newNode;
    }
  }

  public void remove(String data) {
    Node preNode = head;
    Node tempNode = head.link;

    if(data.equals( preNode.getData() )) {
      head = preNode.link;
      preNode.link = null;

    } else {

      while(tempNode != null) {

        if(data.equals(tempNode.getData())) {

          if(tempNode.link == null) {
            preNode.link = null;

          } else {
            preNode.link = tempNode.link;
            tempNode.link = null;

          }

          break;
        } else {
          preNode = tempNode;
          tempNode = tempNode.link;

        }
      }
    }
  }

  public void remove() {
    Node preNode;
    Node tempNode;

    if(head == null) {
      return;
    }

    if(head.link == null) {
      head = null;
    } else {
      preNode = head;
      tempNode = head.link;

      while(tempNode.link != null) {
        preNode = tempNode;
        tempNode = tempNode.link;
      }

      preNode.link = null;
    }
  }

  // Node 탐색
  public Node searchNode(String data) {
    Node tempNode = this.head;

    while(tempNode != null) {
      if(data.equals(tempNode.getData())) {
        return tempNode;
      } else {
        tempNode = tempNode.link;
      }
    }

    return tempNode;
  }

  public void reverse() {
    Node nextNode = head;
    Node currentNode = null;
    Node preNode = null;

    while(nextNode != null) {
      preNode = currentNode;
      currentNode = nextNode;
      nextNode = nextNode.link;
      currentNode.link = preNode;
    }

    head = currentNode;
  }

  public void printList() {
    Node tempNode = this.head;

    while(tempNode != null) {
      System.out.print(tempNode.getData() + " ");
      tempNode = tempNode.link;
    }
    System.out.println();
  }


}
public class LinkedListExample {
  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();    // 연결 리스트 생성
    String str = "wed";

    linkedList.add("sun");
    linkedList.add("mon");
    linkedList.add("tue");
    linkedList.add("wed");
    linkedList.add("thu");
    linkedList.add("fri");
    linkedList.add("sat");
    linkedList.printList();

    System.out.println(linkedList.searchNode(str).getData());

    linkedList.remove(linkedList.searchNode(str).getData());
    linkedList.printList();

    str = "sun";

    linkedList.remove(linkedList.searchNode(str).getData());
    linkedList.printList();

    linkedList.reverse();
    linkedList.printList();
    linkedList.add(linkedList.searchNode("mon"), "days");
    linkedList.printList();
  }
}

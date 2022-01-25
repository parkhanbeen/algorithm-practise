package com.algorithm.datastructure;

class Tree {
  int count;

  public Tree() {
    count = 0;
  }

  public class Node {
    Object data;
    Node left;
    Node right;

    public Node(Object data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }

    public void addRight(Node node) {
      this.right = node;
      count++;
    }

    public void addLeft(Node node) {
      this.left = node;
      count++;
    }

    public void deleteRight() {
      this.right = null;
      count--;
    }

    public void deleteLeft() {
      this.left = null;
      count--;
    }

  }

  public Node addNode(Object data) {
    Node node = new Node(data);
    return node;
  }

  public void preOrder(Node node) {
    if (node == null) {
      return;
    }

    System.out.println(node.data + "");
    preOrder(node.left);
    preOrder(node.right);
  }

  public void inOrder(Node node) {
    if (node == null) {
      return;
    }

    inOrder(node.left);
    System.out.println(node.data + "");
    inOrder(node.right);
  }

  public void postOrder(Node node) {
    if (node == null) {
      return;
    }

    postOrder(node.left);
    postOrder(node.right);
    System.out.println(node.data + "");
  }

}

public class TreeExample {
  public static void main(String[] args) {
    // 트리 생성
    Tree tree = new Tree();

    // 노드 생성
    Tree.Node node1 = tree.addNode(1);
    Tree.Node node2 = tree.addNode(2);
    Tree.Node node3 = tree.addNode(3);
    Tree.Node node4 = tree.addNode(4);
    Tree.Node node5 = tree.addNode(5);
    Tree.Node node6 = tree.addNode(6);
    Tree.Node node7 = tree.addNode(7);

    // 트리 연결관계 생성
    /*  트리 모양
     *        1
     *     2     3
     *   4  5  6   7
     */
    node1.addLeft(node2);
    node1.addRight(node3);
    node2.addLeft(node4);
    node2.addRight(node5);
    node3.addLeft(node6);
    node3.addRight(node7);

    // 순회
    tree.preOrder(node1);
    System.out.println();
    tree.inOrder(node1);
    System.out.println();
    tree.postOrder(node1);
    System.out.println();

    // 삭제
    node2.deleteLeft();
    node3.deleteRight();
    /* 삭제 이후 트리 모양
     *        1
     *     2     3
     *      5  6
     */

    // 순회
    System.out.println();
    tree.preOrder(node1);
    System.out.println();
    tree.inOrder(node1);
    System.out.println();
    tree.postOrder(node1);
    System.out.println();
  }
}

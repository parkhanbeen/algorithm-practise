package com.algorithm.datastructure;

class Queue {
  int front;
  int rear;
  int capacity;
  Object[] queue;
  Queue(int capacity){
    this.front = -1;
    this.rear = -1;
    this.capacity = capacity;
    queue = new Object[this.capacity];
  }

  public boolean isFull() {
    return (this.rear == this.capacity - 1);
  }

  public boolean isEmpty() {
    if(front == rear) {
      front = -1;
      rear = -1;
    }
    return (this.front == this.rear);
  }

  public void enqueue(Object element) {
    if(isFull()) {
      System.out.println("Queue is Full!");
      return;
    }

    rear = (rear+1) % this.capacity;
    queue[rear] = element;
  }

  public Object dequeue() {
    if(isEmpty()) {
      System.out.println("Queue is empty");
      return null;
    }

    front = (front+1) % this.capacity;
    return queue[front];
  }

  public Object peek() {
    if(isEmpty()) {
      System.out.println("Queue is empty");
      return null;
    }

    return queue[front+1];
  }

  public int size() {
    return Math.abs((rear + 1) - (front + 1));
  }

  public void clear() {
    if(isEmpty()) {
      System.out.println("Queue is already empty!");
    }
    else {
      front = -1;
      rear = -1;
      queue = new Object[this.capacity];
      System.out.println("Queue has cleared!");
    }
  }
}

public class QueueExample {
  public static void main(String[] args) {
    Queue queue = new Queue(10);

    queue.dequeue();

    for(int i = 0; i < 10; i++) {
      queue.enqueue(i);
    }

    System.out.println("isFull : " + queue.isFull());

    System.out.println("size : " + queue.size());

    for(int i = 0; i < 10; i++) {
      System.out.println("Dequeue : " + queue.dequeue());
      System.out.println("size : " + queue.size());
    }

    System.out.println("Dequeue : " + queue.dequeue());

    System.out.println("isEmpty : " + queue.isEmpty());

    queue.enqueue(555);
    System.out.println("isEmpty : " + queue.isEmpty());
    System.out.println("isFull : " + queue.isFull());
    System.out.println("peek: " + queue.peek());
  }
}

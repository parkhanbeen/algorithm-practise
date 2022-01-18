package com.algorithm.datastructure;

class Stack<T> {
  int top;
  int capacity = -1;
  T[] stack;
  public Stack(int capacity) {
    this.capacity = capacity;
    stack = (T[])(new Object[capacity]);
    System.out.println("size : " + capacity);
    top = -1;
  }

  public void push(T element) {
    if (isFull()) {
      System.out.println("Stack이 가득 찼습니다.");
      return;
    }

    stack[++top] = element;
  }

  public T pop() {
    if(isEmpty()) {
      System.out.println("Stack이 비어있습니다.");
      return null;
    }
    return stack[top--];
  }

  public T peek() {
    if(isEmpty()) {
      System.out.println("Stack이 비어있습니다.");
      return null;
    }

    return stack[top];
  }

  public void clear(){
    if(isEmpty()){
      System.out.println("Stack은 이미 비어있습니다.");
      return;
    }
    top = 0;
    stack = (T[]) (new Object[capacity]);
    System.out.println("Stack 초기화 완료!");
  }

  public int size(){
    return top + 1;
  }

  public boolean isEmpty() {
    return this.top == -1;
  }

  private boolean isFull() {
    return this.top == (this.capacity + 1);
  }
}

public class StackExample {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>(5);
    for(int i = 0; i < 5; i++) {
      stack.push((i + 1));
      System.out.println(i + " 번째 peek: " + stack.peek());
    }
    System.out.println("=============================");
    for(int i = stack.size(); i > 0; i--) {
      System.out.print(i + " 번째 : " + stack.pop() + " | " );
    }
  }
}

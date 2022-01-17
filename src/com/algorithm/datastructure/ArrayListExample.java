package com.algorithm.datastructure;

class ArrayList<T> {
  Object[] array = null;
  int capacity = 0;
  int size = 0;

  public ArrayList() {
    capacity = 1;
    array = new Object[capacity];
    size = 0;
  }

  public ArrayList(int capacity) {
    this.capacity = capacity;
    array = new Object[capacity];
    size = 0;
  }

  public void add(Object element) {
    if (size == capacity) {
      expandArray();
    }
    array[size++] = element;
  }

  public void addFirst(T element){
    add(0, element);
  }

  public void add(int index, T element) {
    if (size == capacity) {
      expandArray();
    }
    for (int i = size; i < index; i--) {
       array[i] = array[i-1];
    }
    array[index] = element;
    size++;
  }

  private void expandArray() {
    capacity *= 2;
    Object[] tempArray = new Object[capacity];
    copyArray(tempArray, array);
    array = new Object[capacity];
    copyArray(array, tempArray);
  }

  private void copyArray(Object[] array1, Object[] array2) {
    for (int i = 0; i < array2.length; i++) {
      array1[i] = array2[i];
    }
  }

  public T get(int index) {
    if (size <= 0) {
      System.out.println("배열이 비어있습니다.");
      return null;
    }
    return (T) array[index];
  }

  public T remove(int index) {
    T result = (T) array[index];
    array[index] = null;
    size--;
    if (size > 0) {
      for (int i = index; i < size; i++) {
         array[i] = array[i + 1];
      }
    }
    return result;
  }

  public void reset() {
    array = new Object[capacity];
    size = 0;
  }

  public int size() {
    return this.size;
  }

  public int getCapacity() {
    return this.capacity;
  }
}

public class ArrayListExample {
  public static void main(String[] args) {
    System.out.println("=====짧은머리 개발자=====");
    ArrayList<Integer> arr = new ArrayList<>();
    System.out.println("배열 크기 : " + arr.getCapacity());
    System.out.println("데이터 삽입 1~5");
    for(int i = 0; i < 5; i++) {
      arr.add((i+1));
    }

    //출력
    System.out.println("\n==출력==");
    for(int i = 0; i < arr.size(); i++) {
      System.out.print(i + "번째 : " + arr.get(i) + " | ");
    }
    System.out.println("\n배열 크기 : " + arr.getCapacity());



    arr.add(1, 6);
    arr.add(4, 7);
    System.out.println("\n==출력2==");
    for(int i = 0; i < arr.size(); i++) {
      System.out.print(i + "번째 : " + arr.get(i) + " | ");
    }
    System.out.println("\n배열 크기 : " + arr.getCapacity());



    System.out.println("1번째 요소 삭제 : " + arr.remove(1));
    System.out.println("\n==출력3==");
    for(int i = 0; i < arr.size(); i++) {
      System.out.print(i + "번째 : " + arr.get(i) + " | ");
    }
    System.out.println("\n배열 크기 : " + arr.getCapacity());



    System.out.println("\n==출력4==");
    while(arr.size() > 0) {
      System.out.println("0번째 삭제: " + arr.remove(0));
    }
    System.out.println("\n배열 크기 : " + arr.getCapacity());


    System.out.println("데이터 삽입 1~5");
    for(int i = 0; i < 5; i++) {
      arr.add((i*2));
    }

    //출력
    System.out.println("\n==출력6==");
    for(int i = 0; i < arr.size(); i++) {
      System.out.print(i + "번째 : " + arr.get(i) + " | ");
    }
    System.out.println("\n배열 크기 : " + arr.getCapacity());


    System.out.println("초기화");
    arr.reset();
    System.out.println("\n==출력7==");
    for(int i = 0; i < arr.size(); i++) {
      System.out.print(i + "번째 : " + arr.get(i) + " | ");
    }
    System.out.println("\n배열 크기 : " + arr.getCapacity());
  }
}

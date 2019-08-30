package JavaConcepts.Generics;

import java.nio.BufferOverflowException;

/**
 * Created by Abhishek gupta on 2019-05-29
 */
//
// class GenericArray<T> {
//
//  private T[] items;
//
//  private int size;
//
//  private final Integer capacity;
//
//  public GenericArray(Integer capacity) {
//    this.capacity = capacity;
//    this.size = 0;
//    items = new T[capacity];
//  }
//
//  public void addItem(T item){
//    if(size >= capacity) {
//      throw new BufferOverflowException();
//    }
//    items[size++] = item;
//  }
//}
//
//// Driver class to test above
//public class Main
//{
//  public static void main (String[] args)
//  {
//  }
//}
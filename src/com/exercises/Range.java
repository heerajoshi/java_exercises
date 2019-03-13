package com.exercises;

import java.util.ArrayList;

public abstract class Range<T> {

  T start;
  T end;
  ArrayList<T> list;

  public Range(T start, T end) {
    this.start = start;
    this.end = end;
  }

  public ArrayList<T> getAll() {
    return this.list;
  }

  public boolean containsElement(T element) {
    return list.contains(element);
  }

  public abstract void createList();
}

package com.exercises;

import java.util.ArrayList;

public  class NumberRange extends Range<Integer>{

  public NumberRange(int start, int end) {
    super(start, end);
    this.list = new ArrayList<>(this.end-this.start);
    this.createList();
  }

  @Override
  public void createList() {
    for(int i=super.start; i<=super.end; i++)
      super.list.add(i);
  }
}

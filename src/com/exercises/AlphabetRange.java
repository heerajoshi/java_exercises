package com.exercises;

import java.util.ArrayList;

public class AlphabetRange extends Range<Character>{

  public AlphabetRange(char start, char end) {
    super(start, end);
    this.list = new ArrayList<>(this.end-this.start);
    this.createList();

  }

  @Override
  public void createList() {
    for(int i=super.start; i<=super.end; i++)
      super.list.add((char) i);
  }
}

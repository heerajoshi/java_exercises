package com.exercises;

import java.util.HashSet;
import java.util.Set;

public class Sets {

  private Set firstSet;
  private Set secondSet;

  public Sets(Set firstSet, Set secondSet) {
    this.firstSet = firstSet;
    this.secondSet = secondSet;
  }

  public Set getUnion(){
    Set  temp1 = new HashSet<>(Set.copyOf(firstSet));
     temp1.addAll(secondSet);
    return temp1;
  }

  public Set getIntersection(){
    Set  temp1 = new HashSet<>(Set.copyOf(firstSet));
    temp1.retainAll(secondSet);
    return temp1;
  }
}

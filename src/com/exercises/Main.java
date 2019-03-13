package com.exercises;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
  //  public static void main(String[] args) {
////    Range<Integer> numberRange = new NumberRange(1, 10);
////    System.out.println(numberRange.getAll());
////    System.out.println(numberRange.containsElement(3));
////    Range<Character> alphabetRange = new AlphabetRange('a', 'f');
////    System.out.println(alphabetRange.getAll());
////    System.out.println(alphabetRange.containsElement('g'));
////    System.out.println(alphabetRange.containsElement(90));
//    new Sets<Integer>()
//
//  }
  public static void main(String[] args) {
    HashSet<Integer> set1 = new HashSet<>();
    set1.add(2);
    set1.add(3);
    set1.add(4);
    set1.add(5);
    HashSet<Integer> set2 = new HashSet<>();
    set2.add(9);
    set2.add(3);
    set2.add(4);
    set2.add(8);
    Sets set = new Sets(set1, set2);
    System.out.println(set.getIntersection());
    System.out.println(set.getUnion());





    HashSet<String> set3 = new HashSet<>();
    set3.add("aah");
    set3.add("abh1");
    set3.add("abh2");
    set3.add("abh3");
    HashSet<String> set4 = new HashSet<>();
    set4.add("abh2");
    set4.add("ab3");
    set4.add("aba4");
    set4.add("a5");
    Sets charSet = new Sets(set3, set4);
    System.out.println(charSet.getIntersection());
    System.out.println(charSet.getUnion());
    System.out.println(set.getUnion());
  }
}

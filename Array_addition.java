//Write a program in java to join two arraylists into one arraylist.

import java.util.*;
class ArrayAddition {
    public static void main(String[] args) {
ArrayList<Integer> a1 = new ArrayList<Integer>();
      a1.add(1);
      a1.add(2);
      a1.add(3);
      a1.add(4);
      a1.add(5);
    
ArrayList<Integer> a2 = new ArrayList<Integer>();
      a2.add(6);
      a2.add(7);
      a2.add(8);
      a2.add(9);
      a2.add(10);
       
    System.out.print("Array 0ne : ");
        for(int i : a1) {
            System.out.print(i + " ");
    }
    System.out.println();
    System.out.print("Array two : ");
        for(int i : a2) {
            System.out.print(i + " ");
    }
    System.out.println();
    a1.addAll(a2);
    System.out.print("Array 0ne + Array Two : ");
        for(int i : a1) {
            System.out.print(i + " ");
    }
    }
}
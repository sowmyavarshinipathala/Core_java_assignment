/* Write a program in java make a arraylist and do certain operation 

1. reverse the arraylist
2. sort the arraylist.
3. remove elements of arraylist. */



import java.util.*;
class ArrayList_Operations {
    public static void main(String[] args) {
         
ArrayList<Integer> a1 = new ArrayList<Integer>();
      a1.add(1);
      a1.add(0);
      a1.add(3);
      a1.add(8);
      a1.add(5);
       System.out.print("ArrayList : ");
       for(int i : a1)
        System.out.print(i + " ");
     System.out.println();    
      System.out.print("Reverse of ArrayList : ");
      Collections.reverse(a1); 
      for(int i : a1)
        System.out.print(i + " ");
         System.out.println();
      System.out.print("Sorting of ArrayList : ");
      Collections.sort(a1); 
       for(int i : a1)
        System.out.print(i + " ");
     System.out.println();
      System.out.println("ArrayList after removing elements of arraylist : ");
      a1.clear();
      for(int i : a1)
        System.out.print(i);
     
    }
}
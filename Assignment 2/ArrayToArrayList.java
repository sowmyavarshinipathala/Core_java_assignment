/* "Write a Java program that takes an integer array as input and converts it into an ArrayList. The program should have a method called convertArrayToList that takes in the array as a parameter and returns the converted ArrayList.

The input for the program is an array {1, 2, 3, 4, 5} 

The output of the program should be the ArrayList

 [1, 2, 3, 4, 5] after the conversion."*/

import java.util.*;
class ArrayToArrayList {
    public static void main(String[] args) {
         Integer arr[] = { new Integer(1),
                            new Integer(2),
                            new Integer(3),
                            new Integer(4),
                            new Integer(5) };
ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(arr));
            System.out.print(al);
    }
}

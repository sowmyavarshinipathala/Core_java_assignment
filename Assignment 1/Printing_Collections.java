//Write a program to Print all the elements of a collection in Java.

import java.util.*;
class Collections {
    String Name_Of_Book;
    int Pages;
    Collections(String s, int p) {
        this.Name_Of_Book = s;
        this.Pages = p;
    }
    public String toString() {
        return "Name of the book is " + Name_Of_Book + " and Pages : " + Pages;
    }


    public static void main(String[] args) {
        ArrayList<Collections> a = new ArrayList<Collections>();
        Collections obj1 = new Collections("Java",5000);
        Collections obj2 = new Collections("C++",3500);
        Collections obj3 = new Collections("Html",2500);
        Collections obj4 = new Collections("Python",5200);
        a.add(obj1);
        a.add(obj2);
        a.add(obj3);
        a.add(obj4);
        for(Collections i : a) {
            System.out.println(i);
        }
    }
}
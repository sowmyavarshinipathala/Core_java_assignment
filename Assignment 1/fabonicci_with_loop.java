//Take the input from the user and find the term of the fabonacii using for loop.

import java.util.Scanner;
class Fabonicci {
    public static void fab(int n) {
        int n1 = 0, n2 = 1;
        int n3 = 0;
       
       for(int i = 2; i < n; i++) {
           n3 = n1 + n2;
           n1 = n2;
           n2 = n3;
          }
          System.out.println("The " + n + "th term of fabonicci series is : " + n3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       fab(n);
    }
}
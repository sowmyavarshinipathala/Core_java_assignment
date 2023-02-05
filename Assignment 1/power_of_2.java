//Find the power of 2 using Recursion. Also take the input from the user.

import java.util.Scanner;
class Power_of_two {
    public static int pow(int n) {
        if(n==1)
         return 2;
        return 2*pow(n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(pow(n));
    }
}

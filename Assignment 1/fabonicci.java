 //Take the input from the user and find the term of the fibonacci series using recursion 


import java.util.Scanner;
class Fabonicci {
    public static int fab(int n) {
       if(n==1)
       return 0;
       if(n==2)
       return 1;
       return fab(n-1)+fab(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The " + n + "th term of fabonicci series is : " + fab(n));
    }
}
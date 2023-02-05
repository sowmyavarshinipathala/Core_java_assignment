
// Find the sum of the numbers using for loop.


import java.util.Scanner;
class Sum_of_numbers {
    public static int sum(int n) {
        int sum = 0;
       for(int i=1; i <= n; i++) {
           sum = sum + i;
       }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}

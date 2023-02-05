//Print count
import java.util.Scanner;

class recursion {
    public static void count(int x) {
        if(x == 0) {
            return ;
        }
        count(x-1);
        System.out.print(x);
    }
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            count(n);
        }
    }
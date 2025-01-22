import java.util.Scanner;
public class Demo028 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10; 
        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
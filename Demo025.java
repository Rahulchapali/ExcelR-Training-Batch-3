import java.util.Scanner;
public class Demo025 {
    public static void main(String[] args) {
        Scaanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        sc.close();
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
    }
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}